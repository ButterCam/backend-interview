package com.bybutter.interview;

import com.bybutter.interview.java.Case1Java;
import com.bybutter.interview.java.Case2Java;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class JavaCase2Test {

    private Case2Java case2Java = new Case2Java();

    /**
     * 小的减大的
     */
    @Test
    void case1(){
        String result = case2Java.minus("1","9");
        Assertions.assertEquals("-8",result,"Case2Java case1计算有误");
    }

    /**
     * 大的减小的
     */
    @Test
    void case2(){
        String result = case2Java.minus("67","32");
        Assertions.assertEquals("35",result,"Case2Java case2计算有误");
    }

    /**
     * 大数加
     */
    @Test
    void case3(){
        String result = case2Java.minus("7548276720821234708758173874142","65743567348265816348137401937481274892374826574358734624892");
        Assertions.assertEquals("-65743567348265816348137401929932998171553591865600560750750",result,"Case2Java case3计算有误");
    }

}
