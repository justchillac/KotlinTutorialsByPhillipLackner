class Circle(
    val radius : Double
) {
    val pi : Double = 3.14

    init{
        println("Circle created with radius: $radius")
        println("The area of Circle is ${area()}")
        println("The perimeter of Circle is ${perimeter()}")
    }

    fun area() = pi * radius * radius

    fun perimeter() = 2 * pi * radius
}