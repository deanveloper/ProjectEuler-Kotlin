package com.deanveloper.projecteulerkotlin

import com.deanveloper.projecteulerkotlin.solutions.Solution2

/**
 * @author Dean
 */
fun main(vararg args: String) {
    println(Solution2())
}

interface Solution : () -> Number {
    // I'll add some utility methods here at some point
}