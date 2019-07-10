package cn.tellsea.core.common.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * 全局异常
 *
 * @author: tellsea
 * @date: 2019/7/10
 */
public class GlobalException extends RuntimeException {

    @Getter
    @Setter
    private String message;

    public GlobalException(String message) {
        this.message = message;
    }
}