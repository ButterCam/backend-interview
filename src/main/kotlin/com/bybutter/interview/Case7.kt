package com.bybutter.interview

class LampBelt(private val list: Array<Boolean>) {
    val lights get() = listOf(*list)

    fun switch(i: Int) {
        if (!switchInternal(i)) {
            throw IndexOutOfBoundsException()
        }
        switchInternal(i - 1)
        switchInternal(i + 1)
    }

    private fun switchInternal(i: Int): Boolean {
        if (i in 0..list.lastIndex) {
            list[i] = !list[i]
            return true
        }

        return false
    }
}

interface Case7 {
    fun turnAllOn(belt: LampBelt): Boolean
}