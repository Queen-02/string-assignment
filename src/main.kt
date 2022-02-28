fun main() {
    val name = "Akirachix"
    val some = name[0].toString() + name[2] + name[3]
    println(some)
    credit("Queen", "23 years old")
    lin()
    crew()
}

fun credit(name: String, age: String) {
    val greet = "Hi my name is"
    val sum = "I am"
    val tog = greet + " " + name + " " + sum + " " + age
    println(tog)
}

fun lin() {
    val lon = "mesopotamia"
    println(lon.length)
}

fun crew() {
    var nme = "Queen"

    if ("Queen" in nme) {
        println("hey that's me")
    }else {
        println("I don't know who that is")
    }
}