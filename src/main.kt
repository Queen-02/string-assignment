fun main() {
    //prints out the first, third and fourth
    characters("Akirachix")

    //returning the greetings and age
    var greet = credits("Quienzy", 23)
    println(greet)

    //returning the length of a word
    var length = words("mesopotamia")
    println(length)

    //if else functions
    crew("Queenzy")
}
//function that prints out thr fisrt, third and fourth characters
fun characters(name: String) {
    val some = name[0].toString() + name[2] + name[3]
    println(some)
}

//function that takes in two parameters and returns a sting with a structure
fun credits(name: String, age: Int) : String {
    var greeting = "Hi my name is $name, I am ${age.toString()} years old."
    return greeting
}

//function that prints out the length of a string
fun words(word:String): Int {
    var size = word.length
    return size

}


//function that takes in a name and it prints out
fun crew(name: String) {

    if (name.equals("Queenzy")) {
        println("Hey that's me")
    }else {
        println("I don't know who that is")
    }
}