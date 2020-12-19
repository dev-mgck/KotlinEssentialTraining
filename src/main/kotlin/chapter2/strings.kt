package chapter2


fun main() {

    // a especificação do tipo de dado é opcional
    val greeting: String = "Hello there"
    val owe = 50

    // é possível usar templates para exibir um valor -> use barra invertida '\'
    val janet = "I owe Janet \$$owe dollars"
    println(janet)

    // Rederização de caracteres ASCII e Unicode
    val infinity = "The infinity symbol is \u221E"
    val copyright = "The copyright symbol is \u00A9"
    val dagger = "The dagger symbol is \u2020"
    println(infinity)
    println(copyright)
    println(dagger)

    //
    println("[$greeting] is ${greeting.length} characters long")
    println(greeting.toLowerCase())
    println(greeting.toUpperCase())
    println(greeting.slice(1..5)) // output: 'ello'

    // Recuperar um elemento a partir do index
    var bad = greeting.get(1)
    val letter = greeting[1] // modo recomendado []
    println(bad == letter) // output 'true'

    val compare1 = "beta"
    val compare2 = "alpha"
    println("${compare1.compareTo(compare2)}")

    // Subsequencia de uma string
    val sub = greeting.subSequence(6, 9)
    println("sub = $sub")

    // String são objetos iteráveis
    for (single in greeting) {
        print("$single ")
    }

    val myString = """
    Kotlin is fun.
    Kotlin is pragmatic.
    """
    println(myString)
}