package com.gainer.demo.config.exception;
/**
 * 处理rpc调用的异常
 */
public class RpcException extends  RuntimeException{
    public RpcException (String message) {
        super(message);
    }
}
