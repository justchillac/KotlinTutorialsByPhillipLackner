class Rectangle(
    val a : Double,
    val b : Double
) {
    init {
        println("Rectangle created with side $a and $b")
        println("The area of rectangle is ${area()}")
        println("The perimeter of rectangle is ${perimeter()} ")
        println("Is the rectangle a square? ${isSquare()}")
    }

    fun area() = a*b

    fun perimeter() = 2 * (a+b)

    fun isSquare() = a==b
}