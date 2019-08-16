package com.bybutter.interview;

import com.bybutter.interview.java.Case3Java;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class JavaCase3Test {

    private Case3Java case3Java = new Case3Java();

    /**
     * 小的减大的
     */
    @Test
    void case1(){
        String result = case3Java.times("1","9");
        Assertions.assertEquals("9",result,"Case3Java case1计算有误");
    }

    /**
     * 两数相乘
     */
    @Test
    void case2(){
        String result = case3Java.times("67","32");
        Assertions.assertEquals("2144",result,"Case3Java case2计算有误");
    }
    /**
     * 两数相乘
     */
    @Test
    void case3(){
        String result = case3Java.times("67","0");
        Assertions.assertEquals("0",result,"Case3Java case3计算有误");
    }

    /**
     * 大数加
     */
    @Test
    void case4(){
        String result = case3Java.times("7548276720821234708758173874142","65743567348265816348137401937481274892374826574358734624892");
        Assertions.assertEquals("-65743567348265816348137401929932998171553591865600560750750",result,"Case3Java case4计算有误");
    }

}
