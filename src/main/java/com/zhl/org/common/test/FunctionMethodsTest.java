package com.zhl.org.common.test;

import com.zhl.org.common.util.KIfUtill;

/**
 * 函数式方法解决if else 测试
 */
public class FunctionMethodsTest {

    /**
     * 处理异常报错
     */
    private static void testExceptionFunction() {
        Boolean flag = true;
        KIfUtill.isTure(flag).throwMessage("我是个可爱的报错信息");
    }

    /**
     * 处理分支
     */
    private static void testBranchFunction() {
        Boolean flag = false;
        KIfUtill.isTureOrFalse(flag).trueOrFalseHandle(() -> {
            System.out.println("我是正确信息输出~~~~~");
        }, () -> {
            System.out.println("我是错误信息输出=====");
        });
    }

    /**
     * 处理非空
     */
    private static void testPresentFunction() {
        String str = "1";
        KIfUtill.isBlankOrNoBlank(str).presentOrElseHandle(System.out::println,
                () -> {
                    System.out.println("我是空字符串");
                });
    }


    public static void main(String[] args) {
//        testExceptionFunction();
//        testBranchFunction();
        testPresentFunction();
    }
}
