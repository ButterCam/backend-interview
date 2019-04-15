package com.bybutter.interview

import com.bybutter.interview.java.Case1Java
import com.bybutter.interview.kotlin.Case1Kt
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

class Case1Test {
    companion object {
        private lateinit var case: Case1

        @JvmStatic
        @BeforeAll
        fun init() {
            case = caseMock(Case1Kt, Case1Java())
        }
    }

    @Test
    fun case1() {
        Assertions.assertEquals(case.add("5", "6"), "11")
    }

    @Test
    fun case2() {
        Assertions.assertEquals(case.add("10", "-3"), "7")
    }

    @Test
    fun case3() {
        Assertions.assertEquals(case.add("20", "-35"), "-15")
    }

    @Test
    fun case4() {
        Assertions.assertEquals(
                case.add("657482357564317894673657834316574657812578231647236576457436571923468327489123657436578126349123078264574537648723841293846792159",
                        "475783425676821634789213572134783267826147086192034672386578436534865783467019238748219748923167892136557436589213470893274892136572657486293187489213748923657436501872"),
                "475783425676821634789213572134783267826804568549598990281252094369182358124831816979866985499625328708480904916702594550711470262921780564557762026862472764951283294031"
        )
    }

    @Test
    fun case5() {
        Assertions.assertEquals(
                case.add("7548276720821234708758173874142",
                        "-65743567348265816348137401937481274892374826574358734624892"),
                "-65743567348265816348137401929932998171553591865600560750750"
        )
    }
}