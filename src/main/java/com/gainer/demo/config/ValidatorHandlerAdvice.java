package com.gainer.demo.config;
import com.hjkj.campus.util.response.ResponseUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.converter.HttpMessageConversionException;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

/**
 * 重写handleBindException，自定义错误返回信息
 *
 * @author Seven
 * @date 2020-09-18
 */
@Slf4j
@RestControllerAdvice
public class ValidatorHandlerAdvice {

    /**
     * 校验错误拦截处理
     *
     * @param exception 错误信息集合
     * @return 错误信息
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseUtils validationBodyException(MethodArgumentNotValidException exception) {
        BindingResult result = exception.getBindingResult();
        StringBuilder sb = new StringBuilder();
        if (result.hasErrors()) {
            List<ObjectError> errors = result.getAllErrors();
            errors.forEach(p -> {
                FieldError fieldError = (FieldError) p;
                sb.append(fieldError.getDefaultMessage());
                sb.append(",");
            });
        }
        String error = sb.toString();
        if (error.length() > 2) {
            error = error.substring(0, error.lastIndexOf(","));
        }
        return ResponseUtils.fail(ResponseUtils.VERIFY_ERROR, error);
    }




    /**
     * 参数类型转换错误
     *
     * @param exception 错误
     * @return 错误信息
     */
    @ExceptionHandler(HttpMessageConversionException.class)
    public ResponseUtils parameterTypeException(HttpMessageConversionException exception) {
        log.error(exception.getCause().getLocalizedMessage());
        return ResponseUtils.fail(ResponseUtils.REQUEST_ERROR, "类型转换错误！");
    }

}