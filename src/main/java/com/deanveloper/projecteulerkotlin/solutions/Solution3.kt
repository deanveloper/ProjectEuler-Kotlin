package com.deanveloper.projecteulerkotlin.solutions

import com.deanveloper.projecteulerkotlin.Solution
import com.deanveloper.projecteulerkotlin.runPrimeSieve
import com.google.common.math.LongMath
import java.math.RoundingMode

/**
 * @author Dean
 */
object Solution3 : Solution {
    override fun invoke(): Number {
        val num = 600851475143L
        val sqrt = LongMath.sqrt(num, RoundingMode.UP)

        if(sqrt > Int.MAX_VALUE) {
            println("Fuck")
        }

        val primes = runPrimeSieve(sqrt.toInt()).filter { num % it == 0L }

        return primes.last()
    }
}