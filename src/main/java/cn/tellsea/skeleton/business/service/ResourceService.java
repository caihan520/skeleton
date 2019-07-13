package cn.tellsea.skeleton.business.service;

import cn.tellsea.skeleton.core.base.service.BaseService;
import cn.tellsea.skeleton.business.entity.Resource;

import java.util.List;

/**
 * Resource 接口
 *
 * @author Tellsea
 * @Description Created on 2019/07/13
 */
public interface ResourceService extends BaseService<Resource> {

    /**
     * 根据id查询所有资源
     *
     * @param id
     * @return
     */
    List<Resource> listUserResource(Long id);
}
