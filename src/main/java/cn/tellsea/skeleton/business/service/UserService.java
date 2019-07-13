package cn.tellsea.skeleton.business.service;

import cn.tellsea.skeleton.core.base.service.BaseService;
import cn.tellsea.skeleton.business.entity.User;

/**
 * User 接口
 *
 * @author Tellsea
 * @Description Created on 2019/07/13
 */
public interface UserService extends BaseService<User> {

    /**
     * 根据用户名查询用户
     *
     * @param username
     * @return
     */
    User getUserByUsername(String username);
}
