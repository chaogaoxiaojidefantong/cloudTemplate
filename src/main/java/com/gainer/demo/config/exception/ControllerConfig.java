package com.gainer.demo.config.exception;
import com.hjkj.campus.util.response.ResponseUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice(basePackages = "com.gainer.demo.controller")
public class ControllerConfig extends ResponseEntityExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResponseUtils exceptionHandler(Exception ex){
        return ResponseUtils.fail(ex.getMessage());
    }

    @ExceptionHandler(RpcException.class)
    public ResponseUtils rpcHandler(RpcException ex) {
        return ResponseUtils.fail("rpc调用"+ex.getMessage());
    }

    @ExceptionHandler(ParseException.class)
    public ResponseUtils parseHandler(ParseException ex){
        return ResponseUtils.fail("类型转化"+ex.getMessage());
    }

   @ExceptionHandler(SqlException.class)
   public ResponseUtils  sqlHandler(SqlException ex){
       return ResponseUtils.fail("sql出错"+ex.getMessage());
   }
}
