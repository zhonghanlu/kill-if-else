package com.zhl.org.common.function.present;

import java.util.function.Consumer;

@FunctionalInterface
public interface PresentOrElseHandler<T extends Object> {

    /**
     * 值不为空时执行消费操作
     * 值为空时执行其他的操作
     **/
    void presentOrElseHandle(Consumer<? super T> action, Runnable emptyAction);

}
