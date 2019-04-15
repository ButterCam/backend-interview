package com.bybutter.interview

data class RoutingResult(val id: String, val params: Map<String, String>)

interface Case5 {
    fun pathRouting(table: Map<String, String>, path: String): RoutingResult?
}