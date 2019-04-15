package com.bybutter.interview.java;

import com.bybutter.interview.Case5;
import com.bybutter.interview.Hard;
import com.bybutter.interview.RoutingResult;
import kotlin.NotImplementedError;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class Case5Java implements Case5 {
    /**
     * 实现一个路径匹配机制，类似于 Spring 的 handler selector 机制，
     * table 是一个键值对，key 是 controller 的 path，类似于：
     * /users/{uid} 这样的字符串，而 value 是对应的 controller id，
     * 可以无需理解。path 是想要进行路由的请求的路径，例如 /users/123。
     *
     * 需要返回一个 RoutingResult 结构，包含对应的 controller id
     * 与从路径上获取的参数，如果无法找到对应的 controller id 请返回 null。
     *
     * 例如：
     * /users/{uid} 对应 controller id 为 getUserInfo，
     * 当输入为 /users/123 时，返回的 RoutingResult 结构的 controller id 为
     * getUserInfo，并且 params 为 {"uid": "123"}
     *
     * 要求：
     * 除了完全匹配之外，还需要支持几种模式匹配功能：
     * 1. Path 变量，例如 /users/{uid}，/images/{id}/template，path 变量会用
     * 大括号表示，并且大括号里面是参数名，需要将路径的该部分放入 params 里面
     * 2. * 通配符，例如 /users&#47;*，任何类似 /users/xxxx，或者 /users/xxxx/xxx...
     * 这样的路径都会被匹配上，* 字符只会出现在路径的结尾
     * 3. Path 变量与正则表达式，例如 /users/{uid:[0-9]+} 只会匹配 /users/123，这样
     * 后面为数字的内容，而 /users/{name:[a-zA-Z-]+} 只会匹配 /users/higan 这样后面为
     * 用户名的内容，并且需要将 uid 或者 name 放到 params 里面
     */
    @Hard
    @Override
    public RoutingResult pathRouting(@NotNull Map<String, String> table, @NotNull String path) {
        throw new NotImplementedError("TODO");
    }
}
