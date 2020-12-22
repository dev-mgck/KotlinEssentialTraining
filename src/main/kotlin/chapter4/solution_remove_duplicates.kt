package chapter4

fun main() {
    val animals =
        listOf("apple", "biscuit", "apple", "cat", "cat", "cat",
            "dog", "elephant", "fox", "goat", "elephant")
    val setAnimals = animals.toSet()
    println(setAnimals)
    val listAnimals = setAnimals.toList().sortedDescending()
    println(listAnimals)
}
