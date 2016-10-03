package com.deanveloper.projecteulerkotlin

import com.deanveloper.projecteulerkotlin.zeroToTen.SolutionOne

/**
 * @author Dean
 */
fun main(vararg args: String) {
    println(SolutionOne())
}

interface Solution : () -> Number {
    // I'll add some utility methods here at some point
}