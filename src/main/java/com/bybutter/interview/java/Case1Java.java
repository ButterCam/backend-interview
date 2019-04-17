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
        //先提交一版正数相加


        //思路：将两个字符串分别放入int数组中进行计算，
        //1，将两个字符串进行倒序放入int数组
        //2, 判断两个字符串长度，定义一个数组来接收相加结果，长度是较长数组+1，初始为0
        //3，将两个数组元素依次相加，如果》10，下一个元素+1，上一个元素 y-10
        //4，倒序输出数组，判断第一个元素是否为0，为0的话舍掉第一个元素，返回字符串

        //1，将两个字符串进行倒序放入int数组
        int[] v1 = new int[value1.length()];
        int[] v2 = new int[value2.length()];
        for( int i = value1.length() - 1 , j = 0; i >= 0;  i --,j++){
            v1[j] = Integer.parseInt(value1.charAt(i) + "");
        }
        for( int i = value2.length() - 1, j = 0;  i >= 0;  i --,j++){
            v2[j] = Integer.parseInt(value2.charAt(i) + "");
        }
        //2, 判断两个字符串长度，定义一个数组来接收相加结果，长度是较长数组+1，初始为0
        int min;
        boolean isV1 = true;
        if(v1.length >= v2.length ){
            min = v2.length - 1;
            isV1 = false;

        }else {
            min = v1.length -1;
        }
        int[] v3 = new int[v1.length >= v2.length ? v1.length + 1 : v2.length + 1];
        //3，将两个数组元素依次相加，如果》10，下一个元素+1，上一个元素 y-10
        for(int i = 0; i < v3.length - 1; i ++){
            if( i > min && isV1 == true){
                v3[i] = v2[i];
            }else if(i > min && isV1 == false){
                v3[i] = v1[i];
            }else {
                int vaule = v1[i] + v2[i];
                if(vaule >= 10){
                    v3[i + 1] = 1;
                    vaule -= 10;
                }
                v3[i] = vaule;
            }

        }
        //4，倒序输出数组，判断第一个元素是否为0，为0的话舍掉第一个元素，返回字符串
        StringBuilder sb = new StringBuilder();
        if(v3[v3.length - 1] != 0){
            sb.append(v3[v3.length - 1]);
        }
        for(int i = v3.length - 2 ; i >= 0; i --){
            sb.append(v3[i]);
        }
        String result = new String(sb);
        return result;

    }
}
