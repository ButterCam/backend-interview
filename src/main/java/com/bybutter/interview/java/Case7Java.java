package com.bybutter.interview.java;

import com.bybutter.interview.Case7;
import com.bybutter.interview.LampBelt;

import kotlin.NotImplementedError;
import org.jetbrains.annotations.NotNull;

public class Case7Java implements Case7 {
    /**
     * 有一个有若干灯泡的灯带，每次都能将灯带中的一个灯泡切换亮灭状态。
     * 在这里，我们用 false 表示灭灯，true 表示亮灯，例如，这是一
     * 个5个灯泡的灯带，灯泡的初始状态为：
     * true, true, false, false, false
     * <p>
     * 我们通过调用 LampBelt.toggle 方法可以将指定的灯泡改变其状态，
     * 通过改变 2，3，4 号灯泡，就可以将灯带改变为全亮的状态。
     * <p>
     * 但是这个灯带出现了一些故障，会导致切换一个灯泡状态的时候，周围的
     * 灯泡的状态也会随之改变。
     * <p>
     * 例如：true, true, false, false, false
     * 改变 2 号灯泡就会导致变成
     * true, false, true, true, false
     * 的状态。
     * 只需要改变 3 号灯泡就可以，让所有灯泡全亮。
     * <p>
     * 函数参数提供了了一个带初始状态的 LampBelt 对象为灯带。
     * 可以通过 LampBelt.lights 获取所有灯泡的状态，而且可以通过
     * LampBelt.toggle 切换其中的一个灯泡（会导致周围两个灯泡一起变化）
     * 请尝试将所有灯泡都变成亮灯状态，如果无法全都变亮的话，返回 false
     * 否则返回 true，并将所有灯泡变成亮灯状态。
     */
    @Override
    public boolean turnAllOn(@NotNull LampBelt belt) {
        throw new NotImplementedError("TODO");
    }
}
