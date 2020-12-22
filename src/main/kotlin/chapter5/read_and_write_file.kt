package chapter5

import java.io.File

fun main() {
    val res = "./src/main/resources"
    val pets = "pets.txt"
    val pFile = File("${res}/$pets") // instância de novo arquivo

    val file = File("${res}/text.txt")
    file.forEachLine { println(it) } // Exibir todas as linhas e seu conteúdo

    val writeFile = File("$res/write.txt")
    writeFile.writeText("Kotlin = happiness") // escrever / sobrescrever

    val pList = listOf("cat", "dog", "bird")
    pFile.writeText("")
    pList.forEach{ pFile.appendText("$it\n")}

    val newPets = mutableListOf<String>("horse")
    pFile.forEachLine { newPets.add(it) }
    println()
    println(newPets)

    val exists = pFile.exists()
    println("\npets exists? $exists")
}


