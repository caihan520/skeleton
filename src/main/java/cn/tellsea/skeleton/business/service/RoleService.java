package cn.tellsea.skeleton.business.service;

import cn.tellsea.skeleton.core.base.service.BaseService;
import cn.tellsea.skeleton.business.entity.Role;

import java.util.List;

/**
 * Role 接口
 *
 * @author Tellsea
 * @Description Created on 2019/07/13
 */
public interface RoleService extends BaseService<Role> {

    /**
     * 根据id查询用户角色
     *
     * @param id
     * @return
     */
    List<Role> listUserRole(Long id);
}
