package cn.tellsea.skeleton.business.mapper;

import cn.tellsea.skeleton.business.entity.Role;
import cn.tellsea.skeleton.core.base.mapper.MyMapper;

import java.util.List;

/**
 * Mapper 接口
 *
 * @author Tellsea
 * @Description Created on 2019/07/13
 */
public interface RoleMapper extends MyMapper<Role> {

    /**
     * 根据id查用户角色
     *
     * @param id
     * @return
     */
    List<Role> listUserRole(Long id);
}
