package com.bybutter.interview;

import com.bybutter.interview.java.Case1Java;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class JavaCase1Test {

    private Case1Java case1Java = new Case1Java();

    /**
     * 基础操作，带进位
     */
    @Test
    void case1(){
        String result = case1Java.add("1","9");
        Assertions.assertEquals("10",result,"Case1Java case1计算有误");
    }

    /**
     * 前面带0操作
     */
    @Test
    void case2(){
        String result = case1Java.add("10","000");
        Assertions.assertEquals("10",result,"Case1Java case2计算有误");
    }

    /**
     * 大数加
     */
    @Test
    void case3(){
        String result = case1Java.add("657482357564317894673657834316574657812578231647236576457436571923468327489123657436578126349123078264574537648723841293846792159","475783425676821634789213572134783267826147086192034672386578436534865783467019238748219748923167892136557436589213470893274892136572657486293187489213748923657436501872");
        Assertions.assertEquals("475783425676821634789213572134783267826804568549598990281252094369182358124831816979866985499625328708480904916702594550711470262921780564557762026862472764951283294031",result,"Case1Java case3计算有误");
    }

}
