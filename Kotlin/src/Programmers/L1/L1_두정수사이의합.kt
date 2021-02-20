package Programmers.L1

import kotlin.math.max
import kotlin.math.min

private fun solution(a: Int, b: Int): Long {
    val adder = IntRangeAdder(a, b)
    return adder.add()
}

fun main() {

}

class IntRangeAdder(num1: Int, num2: Int) {
    private val from = min(num1, num2).toLong()
    private val to = max(num1, num2).toLong()

    fun add(): Long {
        return (from..to).sum()
    }
}