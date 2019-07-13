package cn.tellsea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 项目启动类
 *
 * @author Tellsea
 * @Description Created on 2019/7/13
 */
@SpringBootApplication
@MapperScan("cn.tellsea.skeleton.business.mapper")
public class SkeletonApplication {

    public static void main(String[] args) {
        SpringApplication.run(SkeletonApplication.class, args);
    }

}
