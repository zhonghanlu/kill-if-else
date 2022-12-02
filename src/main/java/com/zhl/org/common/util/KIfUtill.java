package com.zhl.org.common.util;

import com.zhl.org.common.function.branch.BranchHandle;
import com.zhl.org.common.function.exception.ThrowExceptionFunction;
import com.zhl.org.common.function.present.PresentOrElseHandler;

import java.util.Objects;

public class KIfUtill {

    /**
     * 入参boolean类型进行判断，链式返回错误信息
     */
    public static ThrowExceptionFunction isTure(boolean b) {
        return (errorMessage) -> {
            if (b) {
                throw new RuntimeException(errorMessage);
            }
        };
    }

    /**
     * 入参boolean类型，true执行，false执行，底层依旧if else ...
     */
    public static BranchHandle isTureOrFalse(boolean b) {
        return (trueHandle, falseHandle) -> {
            if (b) {
                trueHandle.run();
            } else {
                falseHandle.run();
            }
        };
    }

    /**
     * 值不为空时执行消费操作
     * 值为空时执行其他的操作
     **/
    public static PresentOrElseHandler<?> isBlankOrNoBlank(String str){
        return (consumer,runnable)->{
            if (Objects.isNull(str) || str.length()==0) {
                runnable.run();
            }else {
                consumer.accept(str);
            }
        };
    }

}
