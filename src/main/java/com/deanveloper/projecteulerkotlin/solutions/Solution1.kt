package com.deanveloper.projecteulerkotlin.solutions

import com.deanveloper.projecteulerkotlin.Solution

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5,
 * we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 * @author Dean
 */
object Solution1 : Solution {
    override fun invoke(): Number {
        val sequence = (1 until 1000).asSequence().filter { it % 3 == 0 || it % 5 == 0 }

        return sequence.sum()
    }
}