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
        //预处理两参数
        value1 = preHandle(value1);
        value2 = preHandle(value2);
        //根据两参数长度，长的一定大
        if (value1.length()<value2.length()){
            return "-"+sub(value2,value1);
        }else if (value1.length()>value2.length()){
            return sub(value1,value2);
        }else {
            //如果长度相等则判断哪个大哪个小
            if (value1.compareTo(value2)>0){
                return sub(value1,value2);
            }else {
                return "-"+sub(value2,value1);
            }
        }

    }

    /**
     * 两大数相减，这里传来的参数value1大于value2
     * @param value1
     * @param value2
     * @return 正数结果
     */
    private String sub(String value1, String value2){
        StringBuilder result = new StringBuilder();
        int length1 = value1.length() - 1;
        int length2 = value2.length() - 1;
        int borrow = 0;
        while (length1 >= 0||length2 >= 0){
            int div=10;
            div += length1 >= 0?value1.charAt(length1 --) - '0':0;
            div -= length2 >= 0?value2.charAt(length2 --) - '0':0;
            div -=borrow;
            borrow = div / 10 == 0 ? 1 : 0;
            result.append(div % 10);
        }
        return result.reverse().toString();
    }

    /**
     * 预处理两个量，把多余的0去掉
     * @param valueStr
     * @return 去掉0后的值
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
