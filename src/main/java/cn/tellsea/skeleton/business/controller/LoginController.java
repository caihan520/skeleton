package cn.tellsea.skeleton.business.controller;

import cn.tellsea.skeleton.business.entity.LoginLog;
import cn.tellsea.skeleton.business.service.LoginLogService;
import cn.tellsea.skeleton.core.util.AddressUtils;
import cn.tellsea.skeleton.core.util.IpUtils;
import cn.tellsea.skeleton.core.common.dto.ResponseResult;
import cn.tellsea.skeleton.core.common.enums.StatusEnums;
import eu.bitwalker.useragentutils.Browser;
import eu.bitwalker.useragentutils.OperatingSystem;
import eu.bitwalker.useragentutils.UserAgent;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * 登录控制器
 *
 * @author Tellsea
 * @Description Created on 2019/7/13
 */
@Slf4j
@Controller
public class LoginController {

    @Autowired
    private LoginLogService loginLogService;

    /**
     * 跳转登录页
     *
     * @param kickout
     * @param model
     * @return
     */
    @GetMapping("/login")
    public String login(@RequestParam(value = "kickout", required = false) Integer kickout, Model model) {
        model.addAttribute("kickout", kickout);
        return "page/login/login";
    }

    /**
     * 登录
     *
     * @param username
     * @param password
     * @param rememberMe
     * @param captcha
     * @param request
     * @return
     */
    @ResponseBody
    @PostMapping("/login")
    public ResponseResult login(@RequestParam("username") String username,
                                @RequestParam("password") String password,
                                @RequestParam("rememberMe") boolean rememberMe,
                                @RequestParam("captcha") String captcha,
                                HttpServletRequest request) {
        //校验验证码
        //session中的验证码
        String sessionCaptcha = (String) SecurityUtils.getSubject().getSession().getAttribute(CaptchaController.KEY_CAPTCHA);
        if (null == captcha || !captcha.equalsIgnoreCase(sessionCaptcha)) {
            return ResponseResult.error(StatusEnums.CAPTCHA_ERROR);
        }

        UsernamePasswordToken token = new UsernamePasswordToken(username, password, rememberMe);
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(token);
            // 记录日志
            LoginLog loginLog = new LoginLog();
            String ip = IpUtils.getIpAddr(request);
            loginLog.setUsername(username);
            loginLog.setIp(ip);
            loginLog.setCreateTime(new Date());
            loginLog.setLocation(AddressUtils.getAddress(ip));
            String header = request.getHeader("User-Agent");
            UserAgent userAgent = UserAgent.parseUserAgentString(header);
            Browser browser = userAgent.getBrowser();
            OperatingSystem operatingSystem = userAgent.getOperatingSystem();
            loginLog.setDevice(browser.getName() + " -- " + operatingSystem.getName());
            loginLogService.insert(loginLog);
            return ResponseResult.success(username);

        } catch (DisabledAccountException e) {
            return ResponseResult.error(StatusEnums.UNAUTHORIZED);
        } catch (UnknownAccountException e) {
            return ResponseResult.error(StatusEnums.USER_NOT_FOUND);
        } catch (IncorrectCredentialsException e) {
            return ResponseResult.error(StatusEnums.PASSWORD_ERROR);
        }
    }
}
