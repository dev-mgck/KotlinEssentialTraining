package chapter3


enum class Suit {
    Club, Diamond, Heart, Spade;
}

fun main() {

    when(1) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        3,4 -> println("x == 3 or 4")
    }

    when(Suit.Spade) {
        Suit.Club, Suit.Spade -> println("black card")
        Suit.Diamond, Suit.Heart -> println("red card")
    }

    val name = "Troy"
    val lastName = when (name) {
        "Hattan" -> "Shobokshi"
        "Todd" -> "Miller"
        "Troy" -> "Miles"
        else -> {
            "Unknown"
        }
    }
    println("$name $lastName")

    val age = 18
    val ageType = when (age) {
        in 0..1 -> "baby"
        in 2..4 -> "toddler"
        in 5..12 -> "kid"
        in 13..19 -> "teenager"
        in 20..64 -> "adult"
        else -> "senior"
    }
    println("You are a $ageType")
}
