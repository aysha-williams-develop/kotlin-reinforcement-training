fun main(args: Array<String>) {
    println("Hello, World!")

    Hello("Aysha")
    GoodBye("Aysha")
}

class Hello constructor(name: String) {
    //initilization block
    init {
        println( "Hello, " + name)
    }
}

//Declaring a class without using the 'constructor' keyword
class GoodBye(name: String) {
    init {
        //using string templating instead of concatenation
        println("Goodbye, $name ")
    }
}