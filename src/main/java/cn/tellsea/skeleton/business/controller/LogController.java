package cn.tellsea.skeleton.business.controller;

import cn.tellsea.skeleton.core.base.controller.BaseController;
import cn.tellsea.skeleton.business.entity.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Log 控制层
 *
 * @author Tellsea
 * @Description Created on 2019/07/13
 */
@Controller
@RequestMapping("/log")
public class LogController extends BaseController<Log> {

}
