package cn.tellsea.skeleton.business.controller;

import cn.tellsea.skeleton.core.base.controller.BaseController;
import cn.tellsea.skeleton.business.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* User 控制层
*
* @author tellsea
* @date 2019/07/12 23:52
*/
@Controller
@RequestMapping("/user")
public class UserController extends BaseController<User> {

}
