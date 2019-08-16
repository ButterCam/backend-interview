package com.bybutter.interview.java;

import com.bybutter.interview.Bean;
import com.bybutter.interview.Case6;

import kotlin.NotImplementedError;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Set;

public class Case6Java implements Case6 {
    /**
     * 解决 Bean 之间的依赖，并对 Bean 进行初始化。
     *
     * 传入的参数是一组未被初始化的 Bean，可以通过 Bean.getDependencies()
     * 获取某个 Bean 所依赖的所有 Bean 的 id。并且通过 Bean.fillDependency(Bean)
     * 方法将指定的 Bean 填充进依赖。
     *
     * 当所有的依赖都填充完毕后需要调用 Bean.dependenciesResolved()
     * 方法，告诉所有 Bean 已经依赖填充完毕，可以开始进行初始化了。
     *
     * 接下来需要对 Bean 进行初始化，可以通过 Bean.initializing() 方法
     * 对 Bean 进行初始化。但是 Bean 只能在所有的依赖都已经填充完毕，并且
     * 所依赖的 Bean 都调用过 Bean.initializing() 方法初始化，才能进行
     * 初始化。
     *
     * 可以通过 Bean 的 getInitialized() 来判断 Bean 是否已经调用过初始化
     * 方法。
     *
     * 如果出现无法解决依赖，或者循环依赖的情况下直接返回 false，表示无法解决
     * 依赖。如果所有 Bean 的依赖都解决完毕，并且 Bean 也全部被初始化，返回
     * true 表示依赖解决完毕。
     */
    @Override
    public boolean dependentResolve(@NotNull List<Bean> beans) {

        throw new NotImplementedError("TODO");
    }
}
