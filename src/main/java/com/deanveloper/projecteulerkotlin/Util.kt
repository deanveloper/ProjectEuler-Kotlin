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
fun runPrimeSieve(max: Int): SortedSet<Int> {

    // Create an array of longs which contain all numbers from 2 to the max.
    // Once finished, the map will have -1 in place for all non-prime numbers.
    // All numbers will be offset by 2, as the array will start at "2".
    val arr = BooleanArray(max - 1) { true }

    val primes = sortedSetOf<Int>()

    // For every number in the map (remember, index is offset by 2).
    for(index in 0..max - 2) {
        // If the number hasn't been marked as non-prime.
        if(arr[index]) {
            val prime = index + 2

            // Mark the number as prime.
            primes.add(prime)

            // Mark all multiples as non-prime. Optimized by starting at the prime's square.
            for(nonprime in (prime * prime - 2)..(max - 2) step index + 2) {
                arr[nonprime] = false
            }
        }
    }

    return primes
}