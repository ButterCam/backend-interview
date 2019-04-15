package com.bybutter.interview

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method
import java.lang.reflect.Proxy

class MockProxy<T>(private vararg val delegates: T) : InvocationHandler {
    override fun invoke(p0: Any, p1: Method, p2: Array<out Any>?): Any {
        for (delegate in delegates){
            try{
                return if(p2 == null){
                    p1.invoke(delegate)
                }else{
                    p1.invoke(delegate, *p2)
                }
            }catch (e: NotImplementedError){
                // ignore
            }
        }
        TODO()
    }
}

@Target(AnnotationTarget.FUNCTION)
annotation class Easy

@Target(AnnotationTarget.FUNCTION)
annotation class Normal

@Target(AnnotationTarget.FUNCTION)
annotation class Hard

@Target(AnnotationTarget.FUNCTION)
annotation class Expert

inline fun <reified T> caseMock(vararg delegates: T): T {
    return Proxy.newProxyInstance(
            T::class.java.classLoader,
            arrayOf(T::class.java),
            MockProxy(*delegates)) as T
}
