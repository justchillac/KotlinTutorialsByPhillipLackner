fun main() {
    println("Hello World!")

    //Printing a variable
    var myVariable : Int = 5
    println("This is the value of my variable: $myVariable")

    //Performing arithmetic operations
    var a = 10
    var b = 8
    a += a
    println(a+b)

    val myRect = Rectangle(5.0, 10.0)
    myRect.changeName("Dibba")
    println("I changed the name of my rectangle to ${myRect.name}")


    val myCircle = Circle(5.0)
}