package com.bybutter.interview

import com.bybutter.interview.java.Case5Java
import com.bybutter.interview.kotlin.Case5Kt
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

class Case5Test {
    companion object {
        private lateinit var case: Case5

        @JvmStatic
        @BeforeAll
        fun init() {
            case = caseMock(Case5Kt, Case5Java())
        }
    }

    @Test
    fun case1() {
        val result = case.pathRouting(
                mapOf("/users/{uid}" to "getUserInfo",
                        "/users/{uid}/artworks" to "getUserArtworks",
                        "/public/*" to "publicResource",
                        "/image/{id}" to "getImageInfo")
                , "/users/123")!!
        Assertions.assertEquals(result.id, "getUserInfo")
        Assertions.assertTrue(result.params["uid"] == "123")
    }

    @Test
    fun case2() {
        val result = case.pathRouting(
                mapOf("/users/{uid}" to "getUserInfo",
                        "/users/{uid}/artworks" to "getUserArtworks",
                        "/public/*" to "publicResource",
                        "/image/{id}" to "getImageInfo")
                , "/public/css/style.css")!!
        Assertions.assertEquals(result.id, "publicResource")
        Assertions.assertTrue(result.params.isEmpty())
    }

    @Test
    fun case3() {
        val result = case.pathRouting(
                mapOf("/users/{uid}" to "getUserInfo",
                        "/users/{uid}/artworks" to "getUserArtworks",
                        "/public/*" to "publicResource",
                        "/image/{id}" to "getImageInfo")
                , "/users/123/artworks")!!
        Assertions.assertEquals(result.id, "getUserArtworks")
        Assertions.assertTrue(result.params["uid"] == "123")
    }

    @Test
    fun case4() {
        val result = case.pathRouting(
                mapOf("/users/{uid:[0-9]+}" to "getUserById",
                        "/users/{name:[a-zA-Z-]+}" to "getUserByName")
                , "/users/123")!!
        Assertions.assertEquals(result.id, "getUserById")
        Assertions.assertTrue(result.params["uid"] == "123")
    }

    @Test
    fun case5() {
        val result = case.pathRouting(
                mapOf("/users/{uid:[0-9]+}" to "getUserById",
                        "/users/{name:[a-zA-Z-]+}" to "getUserByName")
                , "/users/higan")!!
        Assertions.assertEquals(result.id, "getUserByName")
        Assertions.assertTrue(result.params["name"] == "higan")
    }
}