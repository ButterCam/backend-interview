package com.bybutter.interview.java;

import com.bybutter.interview.Case1;
import com.bybutter.interview.Easy;
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

        //如果相加的两个数长度都小于10位，则直接转成int型相加返回
        if (value1.length() < 10 && value2.length() <10) {
            return String.valueOf(Integer.valueOf(value1) +Integer.valueOf(value2));
        }

        //将大数小数分别转成数组
        char []  big = value1.length() >= value2.length() ? value1.toCharArray() :  value2.toCharArray();
        char []  litter =  value1.length() >= value2.length() ? value2.toCharArray() :  value1.toCharArray();

        //进位标识
        boolean flag = false;

        int low = litter.length - 1;

        String result = "";

        for (int i = big.length - 1; i >= 0; i --) {

            int addNum = Integer.valueOf(String.valueOf(big[i]));
            int beAddNum = flag ? 1 : 0;

            //如果小的已经全部相加 则判断是否有进位
            if (low >= 0 ) {
                beAddNum = beAddNum + Integer.valueOf(String.valueOf(litter[low]));
            }

            int sum  = addNum + beAddNum;

            if (sum >= 10) {
                flag = true;
                sum -= 10;
            } else {
                flag = false;
            }

            result = sum + result;

            if (i == 0 && flag) {
                result = "1" + result;
            }

            low--;

        }

        return result;
    }
}
