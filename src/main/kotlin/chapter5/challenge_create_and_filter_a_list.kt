package chapter5._05_04.begin

import java.io.File

fun main() {
    val res = "./src/main/resources"

    val salesFile = File("$res/sales.txt")
    val sales = mutableListOf<Double>()
    salesFile.forEachLine {
        val dValues = it.toDoubleOrNull()
        if (dValues != null) {sales.add(dValues)}
    }
    sales.forEach { println(it) }
}
