package chapter3

/* STATEMENT DEFINITION
* In computer programming, a statement is a syntactic unit of an imperative
* programming language tha express some action to be carried out */

/* EXPRESSION DEFINITION
* An expression in a programming language is a combination of one or more
* contants, variables, operators, and functions that the programming
* language interprets... and computers to produce... another value.*/

fun returnsNothing() {
    println("returnsNothing() function")
}

fun main() {
    val bigger = 1000
    val smaller = 1
    // Won't compile
    // val max = bigger > smaller? bigger: smaller
    //
    val max = if (bigger > smaller) bigger else smaller

    val age = 35
    val boardGroup = when (age) {
        in 0..18 -> "family"
        in 65..200 -> "senior"
        else -> "regular"
    }
    println("You are in the $boardGroup group.")

    val fromNothing = returnsNothing();
    println("$fromNothing")

    var a = 100
    var b = 101
    // Won't compile assignments are statements
    // a = b = 98
}
