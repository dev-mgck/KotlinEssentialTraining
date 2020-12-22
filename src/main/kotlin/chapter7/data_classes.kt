package chapter7._07_03.end

//class Student(val firstName: String, val lastName: String, val grade: Int) {
//    override fun toString(): String {
//        return "($firstName $lastName $grade)"
//    }
//
//    override fun equals(other: Any?): Boolean {
//        if (other is Student) {
//            return lastName == other.lastName &&
//                    firstName == other.firstName &&
//                    grade == other.grade
//        }
//        return false
//    }
//
//    override fun hashCode(): Int {
//        var result = firstName.hashCode()
//        result = 31 * result + lastName.hashCode()
//        result = 31 * result + grade
//        return result
//    }
//}

/* DATA CLASS
As data classes são utilizadas para representar dados de uma forma
estruturada, porém sem a necessidade de se definir getters, setters, toString,
equals ou hashCode; todos esse código repetitivo é gerado automaticamente pelo compilador.

O acesso direto à propriedade permitido pela linguagem Kotlin também
torna a sintaxe muito mais clara

É válido lembrar que ambas funções, funcionam apenas para properties do construtor primário
, ou seja, as demais properties da classe, como por exemplo no corpo
da mesma, não serão consideradas.

*/

data class Student(val firstName: String, val lastName: String, val grade: Int)

fun main() {
    val students = mutableListOf<Student>(
        Student("abel", "baker", 11),
        Student("abel", "baker", 11),
        Student("delta", "echo", 12)
    )
    println()
    println(students[0])
    println("Does ${students[0]} == ${students[1]}: ${students[0] == students[1]}")

    val charlie = students[0].copy(firstName = "charlie")
    students.add(charlie)
    println()
    for(student in students){
        println(student)
    }

    for(i in 0 until students.size){
        println(students[i])
    }
}
