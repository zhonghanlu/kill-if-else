package com.zhl.org.common.function.branch;

/**
 * 处理分支
 */
@FunctionalInterface
public interface BranchHandle {

    /**
     * 入参boolean类型，true执行，false执行，底层依旧if else ...
     */
    void trueOrFalseHandle(Runnable trueHandle, Runnable falseHandle);

}
