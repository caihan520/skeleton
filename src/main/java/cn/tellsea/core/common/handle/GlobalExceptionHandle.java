package cn.tellsea.core.common.handle;

import cn.tellsea.core.common.dto.ResponseResult;
import cn.tellsea.core.common.enums.StatusEnums;
import cn.tellsea.core.common.exception.GlobalException;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletResponse;

/**
 * 全局异常处理
 *
 * @author: tellsea
 * @date: 2019/7/10
 */
@RestControllerAdvice
@Order(value = Ordered.HIGHEST_PRECEDENCE)
public class GlobalExceptionHandle {

    @ExceptionHandler(value = Exception.class)
    public ResponseResult exception(Exception e) {
        e.printStackTrace();
        return new ResponseResult(StatusEnums.SERVER_ERROR);
    }

    @ExceptionHandler(value = GlobalException.class)
    public ResponseResult globalExceptionHandle(GlobalException e, HttpServletResponse response) {
        e.printStackTrace();
        return new ResponseResult(response.getStatus(), e.getMessage());
    }
}