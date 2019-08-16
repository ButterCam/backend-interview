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
        StringBuilder result = new StringBuilder();
        int sum = 0;
        value1 = preHandle(value1);
        value2 = preHandle(value2);
        int value1Length = value1.length() - 1;
        int value2Length = value2.length() - 1;
        while (value1Length >= 0||value2Length >= 0||sum != 0){
            sum += value1Length >= 0 ? value1.charAt(value1Length--) - '0':0;
            sum += value2Length >= 0 ? value2.charAt(value2Length--) - '0':0;
            //余数加入到结果，低位在前
            result.append(sum % 10);
            //算进位
            sum /= 10;
        }
        return result.reverse().toString();
    }

    /**
     * 为了解决诸如 10 + 000 ，010 + 000出错问题，把非0前面的0去掉
     * @param valueStr
     * @return
     */
    private String preHandle(String valueStr) {
        int length = valueStr.length();
        int flag = 0;
        for (int i = 0;i < length; i++){
            int value = valueStr.charAt(i) - '0';
            if (value == 0){
                flag ++;
            }else {
                break;
            }
        }

        String result =valueStr.substring(flag,length);
        return result.equals("")?"0":result;
    }

}
