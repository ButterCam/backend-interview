package com.bybutter.interview.java;

import com.bybutter.interview.Case2;
import com.bybutter.interview.Easy;

import kotlin.NotImplementedError;
import org.jetbrains.annotations.NotNull;

public class Case2Java implements Case2 {
    /**
     * 请实现十进制数字字符串的减法，
     * 每个值肯定为有效的十进制整数字符串，不包含符号，返回值可能包含符号。
     *
     * 例如:
     * "5" - "2" = "3"
     * "46" - "89" = "-43"
     */
    @Easy
    @NotNull
    @Override
    public String minus(@NotNull String value1, @NotNull String value2) {
        long v1=Long.parseLong(value1);
        long v2=Long.parseLong(value2);
        long result=v1-v2;
        return value1+"-"+value2+"="+result;
    }
}
