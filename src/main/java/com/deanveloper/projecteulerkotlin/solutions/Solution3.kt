package com.deanveloper.projecteulerkotlin.solutions

import com.deanveloper.projecteulerkotlin.Solution
import com.deanveloper.projecteulerkotlin.runPrimeSieve

/**
 * @author Dean
 */
object Solution3 : Solution {
    override fun invoke(): Number {
        val num = 600851475143L
        val primes = runPrimeSieve(num)

        return primes.last()
    }
}