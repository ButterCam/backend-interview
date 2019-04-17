package com.bybutter.interview

import com.bybutter.interview.java.Case2Java
import com.bybutter.interview.kotlin.Case2Kt
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

class Case2Test {
    companion object {
        private lateinit var case: Case2

        @JvmStatic
        @BeforeAll
        fun init() {
            case = caseMock(Case2Kt, Case2Java())
        }
    }

    @Test
    fun case1() {
        Assertions.assertEquals("-1", case.minus("5", "6"))
    }

    @Test
    fun case2() {
        Assertions.assertEquals("95", case.minus("115", "20"))
    }

    @Test
    fun case3() {
        Assertions.assertEquals(
            "-65743567348265816348137401929932998171553591865600560750750",
            case.minus("7548276720821234708758173874142",
                "65743567348265816348137401937481274892374826574358734624892")
        )
    }
}