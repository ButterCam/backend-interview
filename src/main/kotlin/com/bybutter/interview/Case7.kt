package com.bybutter.interview

class LampBelt(private val list: Array<Boolean>) {
    val lights get() = listOf(*list)

    fun toggle(i: Int) {
        if (!toggleInternal(i)) {
            throw IndexOutOfBoundsException(i.toString())
        }
        toggleInternal(i - 1)
        toggleInternal(i + 1)
    }

    private fun toggleInternal(i: Int): Boolean {
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