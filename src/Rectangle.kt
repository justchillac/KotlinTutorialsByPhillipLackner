class Rectangle(
    val a : Double,
    val b : Double
) {
    init {
        println("Rectangle created with side $a and $b")
    }

    fun area() = a*b

    fun perimeter() = 2 * (a+b)

    fun isSquare() = a==b
}