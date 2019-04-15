# 黄油相机后端面试
感谢你有兴趣成为黄油相机后端工程师，在这里我们为各位候选人提供了一份编程题。藉此编程题，希望能够直接展现你的编码能力与技术，也作为入职前的热身运动。

## 说明
我们本次共准备了 5 道题目，供你选择，分别有两道 Easy，两道 Normal 与 一道 Hard 题目。你可以无关顺序自由选做，也无需都做完。

## 语言选择
题目支持 Java 与 Kotlin 答题，Java 在 `com.bybutter.interview.java` 包下答题，Kotlin 在 `com.bybutter.interview.kotlin` 包下答题。

### 使用 Java 进行答题
01. 使用 IDE 打开工程
02. 在 `com.bybutter.interview.java` 包下选择想要答的题，共 Case1Java-Case5Java 五道题，请自由选做
03. 选择好想要回答的题之后，删除方法体内的 `throw new NotImplementedError("TODO");`
04. 开始编写实现
05. 在 `test` 包内提供了一些测试用例，供你 debug 使用

### 使用 Kotlin 进行答题
01. 使用 IDE 打开工程
02. 在 `com.bybutter.interview.kotlin` 包下选择想要答的题，共 Case1Kt-Case5Kt 五道题，请自由选做
03. 选择好想要回答的题之后，删除方法体内的 `TODO()`
04. 开始编写实现
05. 在 `test` 包内提供了一些测试用例，供你 debug 使用

## Case1 长整数加法
需要一个将两个数字字符串相加的实现，由于字符串长度不定，需要你对超长字符串做相应的处理。输入的两个的字符串都为标准的十进制整数，可能包含符号。

>限制：  
>不允许使用 `java.math.BigDecimal` 等现有实现。

## Case2 十六进制转换
需要一个将十六进制数字字符串转换为十进制的实现，由于字符串长度不定。

>限制：  
>不允许使用现有实现。

## Case3 长整数乘法
需要一个将两个数字字符串相乘的实现，由于字符串长度不定，需要你对超长字符串做相应的处理。输入的两个的字符串都为标准的十进制整数，可能包含符号。

>限制：  
>不允许使用 `java.math.BigDecimal` 等现有实现。

## Case4 路由记录
需要一个路由表的路由实现，提供的 table 是路由表，是由路由记录构成的 map，key 的格式是 `192.168.0.0/16` 标准子网段，value 是对应的主机名。
需要返回指定的 ip 在路由表里面对应的主机名。路由表的路由规则采用子网段优先的形式，如果 ip 符合了多条路由记录，则选取子网掩码最长的一条。

>限制：  
>不允许使用现有实现。

## Case5 路径匹配
实现一个路径匹配机制，类似于 Spring 的 handler selector 机制，table 是一个键值对，key 是 controller 的 path，类似于：/users/{uid} 这样的字符串，而 value 是对应的 controller id，可以无需理解。path 是想要进行路由的请求的路径，例如 /users/123。

需要返回一个 RoutingResult 结构，包含对应的 controller id 与从路径上获取的参数，如果无法找到对应的 controller id 请返回 null。

除了完全匹配之外，还需要支持几种模式匹配功能：  
1. Path 变量，例如 /users/{uid}，/images/{id}/template，path 变量会用大括号表示，并且大括号里面是参数名，需要将路径的该部分放入 params 里面
2. \* 通配符，例如 /users/\*，任何类似 /users/xxxx，或者 /users/xxxx/xxx... 这样的路径都会被匹配上，* 字符只会出现在路径的结尾
3. Path 变量与正则表达式，例如 /users/{uid:[0-9]+} 只会匹配 /users/123，这样后面为数字的内容，而 /users/{name:[a-zA-Z-]+} 只会匹配 /users/higan 这样后面为用户名的内容，并且需要将 uid 或者 name 放到 params 里面

>限制：  
>不允许使用现有实现。

## 限制
01. 不允许使用现有实现
02. 不添加任何依赖
