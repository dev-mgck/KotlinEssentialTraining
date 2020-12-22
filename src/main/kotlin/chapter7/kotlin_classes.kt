package chapter7._07_01.end

/* CLASSES EM KOTLIN
1) Em Kotlin, somente se especifica o modificador de visibilidade
se o mesmo não for público

2) Usa-se o construtor para inserir dados do mundo real dentro da classe

3) Na maioria dos casos A keyword 'constructor não é obrigatório
* */

class PlainShort {}

class ShortClass // -> classe inútil

// 3)
class WithConstructor constructor(name: String, age: Int) {}
class WithoutConstructor (name: String, age: Int) {} // sem keyword -> shortcut


class MandatoryConstructor internal constructor(name: String, age: Int) {}

class CourseProperty(courseTitle: String) {
    val title = courseTitle
}

class Person(val firstName: String, lastName: String, var age: Int) {}

class Course(courseTitle: String) {
    private val title = courseTitle
    internal var description = ""
    get(){
        return if(field.isNullOrBlank()) "no description" else "$field!"
    }

    fun show() {
        println(title)
    }

//    override fun toString(): String {
//        return "$title - $description"
//    }
}

fun main() {
    val course = Course("Kotlin Essential Training")
    course.description = "secrets you want to know"
    course.show()
    println(course.description)
}
