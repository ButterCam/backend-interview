package com.bybutter.interview

import com.bybutter.interview.java.Case4Java
import com.bybutter.interview.kotlin.Case4Kt
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test


class Case4Test {
    companion object {
        private lateinit var case: Case4

        @JvmStatic
        @BeforeAll
        fun init() {
            case = caseMock(Case4Kt, Case4Java())
        }
    }

    @Test
    fun case1() {
        Assertions.assertEquals(
                case.routing(
                        mapOf("172.16.0.0/12" to "vlan1",
                                "172.17.0.0/16" to "vlan2",
                                "192.168.0.0/16" to "vlan3")
                        , "192.186.1.1"),
                "vlan3"
        )
    }

    @Test
    fun case2() {
        Assertions.assertEquals(
                case.routing(
                        mapOf("172.16.0.0/12" to "vlan1",
                                "172.17.0.0/16" to "vlan2",
                                "192.168.0.0/16" to "vlan3")
                        , "172.17.1.1"),
                "vlan2"
        )
    }

    @Test
    fun case3() {
        Assertions.assertEquals(
                case.routing(
                        mapOf("172.16.0.0/12" to "vlan1",
                                "172.17.0.0/16" to "vlan2",
                                "192.168.0.0/16" to "vlan3")
                        , "172.24.1.1"),
                "vlan1"
        )
    }

    @Test
    fun case4() {
        Assertions.assertEquals(
                case.routing(
                        mapOf("172.16.0.0/12" to "vlan1",
                                "172.17.0.0/16" to "vlan2",
                                "192.168.0.0/16" to "vlan3",
                                "172.16.0.0/16" to "vlan4")
                        , "172.16.1.1"),
                "vlan4"
        )
    }

    @Test
    fun case5() {
        Assertions.assertEquals(
                case.routing(
                        mapOf("172.16.0.0/12" to "vlan1",
                                "172.17.0.0/16" to "vlan2",
                                "192.168.0.0/16" to "vlan3",
                                "172.16.0.0/16" to "vlan4")
                        , "172.128.1.1"),
                null
        )
    }

    @Test
    fun case6() {
        Assertions.assertEquals(
                case.routing(
                        mapOf("172.16.0.0/12" to "vlan1",
                                "172.17.0.0/16" to "vlan2",
                                "192.168.0.0/16" to "vlan3",
                                "172.16.0.0/16" to "vlan4")
                        , "10.0.1.1"),
                null
        )
    }
}