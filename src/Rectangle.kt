import kotlin.random.Random

class Rectangle(
    val a : Double,
    val b : Double
) : Shape("Rectangle"){

    companion object {
        fun randomRect(): Rectangle{
            val a = Random.nextDouble(1.0, 100.0)
            val b = Random.nextDouble(1.0, 100.0)
            return Rectangle(a, b)
        }
    }

    //These are called secondary constructors
    //These are used for constructor overloading
    constructor(a : Double) : this(a, a)

    constructor(a: Int, b:Int) : this(a.toDouble(), b.toDouble())

    init {
        println("$name created with side $a and $b")
        println("The area of $name is ${area()}")
        //Look above, we can access the properties of the superclass(e.g. name)
        println("The perimeter of rectangle is ${perimeter()} ")
        println("Is the rectangle a square? ${isSquare()}")
    }

    //I've assigned shortcut key to override methods as Ctrl+O
    override fun area(): Double = a * b

    override fun perimeter(): Double = 2 * (a + b)

    fun isSquare() = a==b
}