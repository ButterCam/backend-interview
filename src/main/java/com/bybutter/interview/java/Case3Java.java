package com.bybutter.interview.java;

import com.bybutter.interview.Case3;
import com.bybutter.interview.Normal;
import kotlin.NotImplementedError;
import org.jetbrains.annotations.NotNull;

public class Case3Java implements Case3 {
    /**
     * 请实现十进制数字字符串的乘法，
     * 每个值肯定为有效的十进制数字字符串，可能包含符号。
     *
     * 例如:
     * "1" x "2" = "2"
     * "5" x "-1" = "-5"
     */
    @Normal
    @NotNull
    @Override
    public String times(@NotNull String value1, @NotNull String value2) {
        double v1=Double.parseDouble(value1);
        double v2=Double.parseDouble(value2);
        double result=v1*v2;
        return value1+"x"+value2+"="+result;
    }

}
