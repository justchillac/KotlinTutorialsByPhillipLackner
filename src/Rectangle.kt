class Rectangle(
    val a : Double,
    val b : Double
) : Shape("Rectangle"){
    init {
        println("$name created with side $a and $b")
        println("The area of $name is ${area()}")
        //Look above, we can access the properties of the superclass(e.g. name)
        println("The perimeter of rectangle is ${perimeter()} ")
        println("Is the rectangle a square? ${isSquare()}")
    }

    fun area() = a*b

    fun perimeter() = 2 * (a+b)

    fun isSquare() = a==b
}