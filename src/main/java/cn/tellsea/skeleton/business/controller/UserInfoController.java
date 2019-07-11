package cn.tellsea.skeleton.business.controller;

import cn.tellsea.skeleton.core.base.controller.BaseController;
import cn.tellsea.skeleton.business.entity.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* UserInfo 控制层
*
* @author tellsea
* @date 2019/07/11 11:47
*/
@Controller
@RequestMapping("/userInfo")
public class UserInfoController extends BaseController<UserInfo> {

}
