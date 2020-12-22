package chapter7._07_02.end

class Vehicle(
    val make: String, val model: String,
    val year: Int, val state: String = "CA"
) {
    override fun toString(): String {
        return "$year $make $model ($state)"
    }

    // É possível criar mais de 1 bloco init{}, conforme sua necessidade.
    init {
        println("First initializer block - $this")
    }

    // todos os construtores que estão no corpo da classe, são construtores secundários
    // todos ele precisam chamar o construtor primário
    constructor(
        make: String, model: String,
        year: Int, state: String, style: String
    ) : this(make, model, year, state) { // call do construtor primário
        this.style = style
    }

    constructor(
        make: String, model: String,
        year: Int, state: String, style: String, status: String
    ) : this(make, model, year, state, style) { // call do construtor primário modificado
        this.status = status
    }

    constructor (
        make: String, model: String, year: Int, state: String,
        style: String, status: String, color: String
    ) : this(make, model, year, state, style, status) { this.color = color }

    private var style = ""
    private var status = ""
    private var color = ""


}

fun main() {
    val car = Vehicle("Chevrolet", "Volt", 2018)
    println(car)
    val car2 = Vehicle(state = "NV", year = 2019, make = "Ford", model = "Mustang")
    println(car2)
    val car3 = Vehicle("Tesla", "Model S", 2019, "RI", "P100D")
    println(car3)
    val car4 = Vehicle("Tesla", "Model 3", 2019, "CA",
        "Performance", "New")
    println(car4)
    var car5 = Vehicle("VW","Gol", 2020,"MG", "Turbo",
    "New", "Black")
    println(car5)
}
