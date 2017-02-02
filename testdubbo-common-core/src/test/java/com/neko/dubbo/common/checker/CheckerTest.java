package com.neko.dubbo.common.checker;

import org.junit.Test;

/**
 * Created by ssjk on 2017/1/30.
 */

public class CheckerTest {

    @Test
    public void test() {

//        System.out.println(Checker.checker.strIsBlank("有用户名").isPass);
//        System.out.println(Checker.checker.getMessage());

        System.out.println(Checker.checker.strIsNotBlank("有用户名").isPass);
        System.out.println(Checker.checker.getMessage());
    }

}
