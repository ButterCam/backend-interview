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
        //预处理两参数
        value1 = preHandle(value1);
        value2 = preHandle(value2);
        int length1 = value1.length() ;
        int length2 = value2.length() ;
        int[] nums = new int[length1+length2];
        //先不考虑进位情况
        for (int i = 0; i<length1; i++){
            for (int j = 0;j< length2;j++){
                //加一是为了处理进位的时候给最后进位留出空间
                nums[i+j+1] += (value1.charAt(i)-'0') * (value2.charAt(j)-'0');
            }
        }
        //统一处理进位
        for (int i = nums.length-1; i>0;i--){
            if (nums[i]>=10){
                nums[i -1] += nums[i]/10;
                nums[i] = nums[i] %10;

            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0;i<nums.length;i++){
            result.append(nums[i]);
        }
        return preHandle(result.toString());
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
