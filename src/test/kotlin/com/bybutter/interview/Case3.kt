package com.bybutter.interview

import com.bybutter.interview.java.Case3Java
import com.bybutter.interview.kotlin.Case3Kt
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test


class Case3Test {
    companion object {
        private lateinit var case: Case3

        @JvmStatic
        @BeforeAll
        fun init() {
            case = caseMock(Case3Kt, Case3Java())
        }
    }

    @Test
    fun case1() {
        Assertions.assertEquals(
                case.times("435", "654"), "284490")
    }

    @Test
    fun case2() {
        Assertions.assertEquals(
                case.times("10", "-3"), "-30")
    }

    @Test
    fun case3() {
        Assertions.assertEquals(
                case.times("-10", "-3"), "30")
    }

    @Test
    fun case4() {
        Assertions.assertEquals(
                case.times("5674382562789356564738257348956842356483257839659723465789423567948236579823465789236789523654703465709146789342652",
                        "65782356972365793426579342657943265789342657983426590765792365409234659723485653876579246579264579243659283"),
                "373274259343177309425168463404545879775713518110824398337259532653282396714894808445168398605753328826119367828654039928605851110815207560905981569608902118916152929418020362758882172918367866525163210470790756490627638516"
        )
    }
}