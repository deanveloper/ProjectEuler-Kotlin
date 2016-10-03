package com.deanveloper.projecteulerkotlin

import java.util.*

/**
 * A file to store utilities
 *
 * @author Dean
 */
// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
/**
 * Runs a [sieve of Eratosthenes](https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes)
 * to find all primes up to a number.
 */
fun runPrimeSieve(max: Long): SortedSet<Long> {

    // Create a Map<Long, Boolean> which maps all numbers to true.
    // Once finished, the boolean will indicate whether or not the number is considered prime.
    val map: SortedMap<Long, Boolean> = sortedMapOf(*(2..max).map { it to true }.toTypedArray())

    val primes = sortedSetOf<Long>()

    // For every number in the map
    for(num in 2..max) {
        // If the number has not been marked as non-prime
        if(map[num]!!) {
            // Mark the number as prime
            primes.add(num)

            // Mark all multiples as non-prime
            for(nonprime in num..max step num) {
                map[nonprime] = false
            }
        }
    }

    return primes
}