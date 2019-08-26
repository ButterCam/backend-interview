package com.bybutter.interview.java;

import com.bybutter.interview.Case1;
import com.bybutter.interview.Easy;

import kotlin.NotImplementedError;
import org.jetbrains.annotations.NotNull;

public class Case1Java implements Case1 {
    /**
     * 请实现十进制数字字符串的加法，
     * 每个值肯定为有效的十进制整数字符串，不包含符号。
     *
     * 例如:
     * "1" + "2" = "3"
     * "74" + "52" = "126"
     */
    @Easy
    @NotNull
    @Override
    public String add(@NotNull String value1, @NotNull String value2) {

        long v1=Long.parseLong(value1);
        long v2=Long.parseLong(value2);
        long result=v1+v2;
        return value1+"+"+value2+"="+result;
    }
}
