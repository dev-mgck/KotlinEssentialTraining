package chapter4

import com.sun.xml.internal.fastinfoset.util.StringArray

/* Usa-se um array quando precisamos armazenar uma coleção de
itens de tamanho fixo. Os arrays caíram em desuso na programação moderna
para listas.
A diferença essencial entre arrays e listas é que não podemos
redimensionar arrays.
 */

data class Student(val firstName: String, val grade: Int)

fun main() {
    val things: Array<Any> = arrayOf(1, 2, 3, "one", "two", "three")
    things[0] = "zero"
    println("info = ${things.indices}")
    for (thing in things) {
        println(thing)
    }

    val students = arrayOf(
        Student("Todd", 6),
        Student("Vern", 5))

    students[1] = Student("Daisy", 7)
    for (student in students) {
        println(student)
    }

    // :: -> member reference
    val fives = Array(5, ::fiver)
    fives.forEach { println(it) }

    // Propriedades associadas de arrays -> size, indices, lastIndex
    println("fives has ${fives.size} elements")
    println("indices = ${fives.indices} ")
    println("lastIndex = ${fives.lastIndex} ")
    println("ramdom index = ${fives.random()} ")

    val pInts = intArrayOf(1, 2, 3)
    for (p in pInts) {
        println(p)
    }

    val xDoubles = doubleArrayOf(2.5, 5.78, 10.789, 1235.456)
    for (x in xDoubles) {
        println(x)
    }
}

fun fiver(index: Int): Int{
    return index * 5
}
