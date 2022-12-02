package com.zhl.org.common.function.exception;

/**
 * 主要处理抛出异常的if else
 */
@FunctionalInterface
public interface ThrowExceptionFunction {

    /**
     * 入参boolean类型进行判断，链式返回错误信息
     */
    void throwMessage(String message);

}
