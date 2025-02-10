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
    println("The area of rectangle is ${myRect.area()}")
    println("The perimeter of rectangle is ${myRect.perimeter()} ")
   println("Is the rectangle a square? ${ myRect.isSquare()}")
}