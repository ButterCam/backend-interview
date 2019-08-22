import com.bybutter.interview.Case1;
import com.bybutter.interview.Case7;
import com.bybutter.interview.LampBelt;
import com.bybutter.interview.java.Case1Java;
import com.bybutter.interview.java.Case7Java;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class CaseTest {

    private Case1 case1;

    private Case7 case7;


    public CaseTest() {
        this.case1 = new Case1Java();
        this.case7 = new Case7Java();
    }

    @Test
    public void case1Test () {
        // 简单测试
        String result = case1.add("111","1");
        System.out.println(result);

        //测试小于int边界
        String result1 = case1.add("111111111","111111111");
        System.out.println(result1);

        //测试大于int边界
        String result2 = case1.add("1111111111","1111111111");
        System.out.println(result2);

        //测试进位
        String result3 = case1.add("1111111119","1111111111");
        System.out.println(result3);

        //测试不同位数
        String result4 = case1.add("11111111119","1111111111");
        System.out.println(result4);

        //测试不同位数 总位数进位
        String result5 = case1.add("99999999999","111");
        System.out.println(result5);

        //测试超长
        String result6 = case1.add("999999999999999999999999999999999999999999999999" +
                "99999999999999999999999999999999999999999999999999999999" +
                "9999999999999999999999999999999999999999999999999999999999999999","9544545");
        System.out.println(result6);

    }


    @Test
    public void case7Test () {

        //测试题干数据
        case7.turnAllOn(new LampBelt(new Boolean[]{true, true, false, false, false}));

        //测试一个变更不了的数据
        case7.turnAllOn(new LampBelt(new Boolean[]{true, true, true, true, false}));

        //测试全为false
        case7.turnAllOn(new LampBelt(new Boolean[]{false, false, false, false, false}));

        //测试穿插类型
        case7.turnAllOn(new LampBelt(new Boolean[]{false, true, false, true, false}));

        //10次全随机测试
        Random random = new Random();
        for (int i = 0;i < 10 ;i ++)
        case7.turnAllOn(new LampBelt(new Boolean[]{random.nextBoolean(),
                random.nextBoolean(),
                random.nextBoolean(),
                random.nextBoolean(),
                random.nextBoolean()}));

    }
}
