package cn.tellsea.skeleton.business.service.impl;

import cn.tellsea.skeleton.business.entity.Role;
import cn.tellsea.skeleton.business.mapper.RoleMapper;
import cn.tellsea.skeleton.core.base.service.impl.BaseServiceImpl;
import cn.tellsea.skeleton.business.service.RoleService;
import cn.tellsea.skeleton.core.common.enums.StatusEnums;
import cn.tellsea.skeleton.core.common.exception.SkeletonException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Role 接口实现类
 *
 * @author Tellsea
 * @Description Created on 2019/07/13
 */
@Service
public class RoleServiceImpl extends BaseServiceImpl<Role> implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Role> listUserRole(Long id) {
        if (id == 0) {
            throw new SkeletonException(StatusEnums.PARAM_NOT_NULL);
        }
        return roleMapper.listUserRole(id);
    }
}
