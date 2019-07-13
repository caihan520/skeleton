package cn.tellsea.skeleton.business.service;

import cn.tellsea.SkeletonApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class RoleServiceTest extends SkeletonApplicationTests {

    @Autowired
    private RoleService roleService;
    @Autowired
    private ResourceService resourceService;

    @Test
    public void listUserRole() {
        roleService.listUserRole(1L).forEach(role -> System.out.println(role.getName()));
    }

    @Test
    public void listUserResource() {
        resourceService.listUserResource(1L).forEach(resource -> System.out.println(resource.getName()));
    }
}
