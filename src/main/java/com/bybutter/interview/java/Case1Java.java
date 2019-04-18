package com.bybutter.interview.java;

import com.bybutter.interview.Case1;
import com.bybutter.interview.Easy;
import kotlin.NotImplementedError;
import org.jetbrains.annotations.NotNull;

public class Case1Java implements Case1 {
    /**
     * 请实现十进制数字字符串的加法，
     * 每个值肯定为有效的十进制数字字符串，可能包含符号。
     *
     * 例如:
     * "1" + "2" = "3"
     * "74" + "52" = "126"
     * "5" + "-1" = "4"
     */
    @Easy
    @NotNull
    @Override
    public String add(@NotNull String value1, @NotNull String value2) {
        //思路：将字符串中的数字倒序相加，每个字符数组元素-‘0’就是当前元素的int值，
        //用carry来接收两个数组元素之和，将和%10之后放入字符串中，carry /= 10，
        //最后，逆序输出
        StringBuilder sb = new StringBuilder();
        int carry = 0, i = value1.length()-1, j = value2.length()-1;
        while(i >= 0 || j >= 0 || carry != 0){
            if(i>=0){
                carry += value1.charAt(i--)-'0';
            }
            if(j>=0){
                carry += value2.charAt(j--)-'0';
            }
            sb.append(carry%10);
            carry /= 10;
        }
        return sb.reverse().toString();

    }
}
