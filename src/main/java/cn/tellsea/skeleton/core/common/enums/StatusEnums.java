package cn.tellsea.skeleton.core.common.enums;

import lombok.Getter;
import lombok.Setter;

/**
 * 状态枚举类
 *
 * @author: tellsea
 * @date: 2019/7/10
 */
public enum StatusEnums {

    SUCCESS(200, "执行成功"),
    BAD_REQUEST(400, "请求语法错误"),
    UNAUTHORIZED(401, "请求未授权"),
    FORBIDDEN(403, "没有权限访问"),
    NOT_FOUND(404, "请求资源不存在"),
    PARAM_NOT_NULL(500, "参数不能为空"),
    SERVER_ERROR(500, "数据处理异常"),
    SERVER_UNAVAILABLE(503, "服务器异常，请稍后重试"),
    ;

    @Getter
    @Setter
    private int code;
    @Getter
    @Setter
    private String info;

    StatusEnums(int code, String info) {
        this.code = code;
        this.info = info;
    }
}
