package cn.tellsea.core.common.dto;

import cn.tellsea.core.common.enums.StatusEnums;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 全局返回结果集
 *
 * @author: tellsea
 * @date: 2019/7/10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseResult {

    private Integer code;
    private String message;
    private Object data;

    public ResponseResult(StatusEnums enums) {
        this.code = enums.getCode();
        this.message = enums.getInfo();
    }

    public ResponseResult(StatusEnums enums, Object data) {
        this.code = enums.getCode();
        this.message = enums.getInfo();
        this.data = data;
    }

    public ResponseResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public static ResponseResult success() {
        return new ResponseResult(StatusEnums.SUCCESS);
    }

    public static ResponseResult success(Object data) {
        return new ResponseResult(StatusEnums.SUCCESS, data);
    }

    public static ResponseResult error() {
        return new ResponseResult(StatusEnums.SERVER_ERROR);
    }
}