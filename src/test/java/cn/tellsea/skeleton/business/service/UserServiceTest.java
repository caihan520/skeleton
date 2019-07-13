package cn.tellsea.skeleton.business.service;

import cn.tellsea.SkeletonApplicationTests;
import cn.tellsea.skeleton.business.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class UserServiceTest extends SkeletonApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void select() {
//        userService.selectAll().forEach(user -> System.out.println(user));

        System.out.println("--------------------");

        User user = new User();
        user.setUsername("tellsea");
        userService.select(user).forEach(user1 -> System.out.println(user));
    }
}
