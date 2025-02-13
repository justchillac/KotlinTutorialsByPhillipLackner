import kotlin.random.Random

class Circle(
    val radius : Double
) : T("Circle") {

    companion object {
        fun randomCircle() : Circle{
            val radius = Random.nextDouble(1.0, 10.0)
            return Circle(radius)
        }
    }

    init{
        println("Circle created with radius: $radius")
        println("The area of Circle is ${area()}")
        println("The perimeter of Circle is ${perimeter()}")
    }

    override fun area() = ImportantValues.PI * radius * radius

    override fun perimeter() = 2 * ImportantValues.PI * radius
}