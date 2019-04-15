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
        Assertions.assertEquals(case.convert("0xD"), "13")
    }

    @Test
    fun case2() {
        Assertions.assertEquals(case.convert("0xACDC81B0AE1E612731728A43D2528696"), "229772151012765784069777029562509723286")
    }

    @Test
    fun case3() {
        Assertions.assertEquals(case.convert("0xD717C0BE43666B6C803C0273038F1EA16E5A9091ABD2D57FCB72F97B9890FD2C"), "97289230192678683418160902782175643731585168001600097885666298227941149048108")
    }
}