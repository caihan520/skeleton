package cn.tellsea.skeleton.business.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 实体类
 * 
 * @author Tellsea
 * @Description Created on 2019/07/13
 */
@Table(name = "log")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Log implements Serializable {
    /**
     * 编号
     */
    @Id
    @Column(name = "id")
    private Long id;

    /**
     * 操作用户
     */
    @Column(name = "username")
    private String username;

    /**
     * 操作描述
     */
    @Column(name = "operation")
    private String operation;

    /**
     * 耗时(毫秒)
     */
    @Column(name = "time")
    private Long time;

    /**
     * 操作方法
     */
    @Column(name = "method")
    private String method;

    /**
     * 操作参数
     */
    @Column(name = "params")
    private String params;

    /**
     * IP地址
     */
    @Column(name = "ip")
    private String ip;

    /**
     * 操作时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 操作地点
     */
    @Column(name = "location")
    private String location;
}