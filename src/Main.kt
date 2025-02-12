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
    val maxAreaRectCircle = maxArea(myRect, myCircle)
    println("The max area among the shapes is: $maxAreaRectCircle")

    //Generating circle using companion object
    val circle1 = Circle.randomCircle()
    println("Circle created with radius ${circle1.radius}")
    //We can see above that we don't need an instance of Circle object
    //We don't have to write as such, for example:
    //No need of creating instance: val myCircle = Circle(5.0)
    //val circle = myCircle.randomCircle() this is incorrect

    //Similarly generating rectangle with random sides using companion object
    val rect1 = Rectangle.randomRect()
    println("Rectangle with length: ${rect1.a} & breadth: ${rect1.b} created")

    //Anonymous class trapezium
    val c = 6
    val d = 7
    val height = 5
    val trapezium = object : Shape("trapezium", a, b, c, d, height){

        override fun area(): Double {
            return  (a+b)*height/2.0
        }

        override fun perimeter(): Double {
            return  (a+b+c+d).toDouble()
        }
    }

    println("The area of trapezium is ${trapezium.area()} and its perimeter is ${trapezium.perimeter()}")

//    val x = readLine()?.toInt()
    //Exception Handling
    val x = try {
        readLine()?.toInt()
    } catch (
        e: NumberFormatException
    ){
        //That is if you have entered a string
        0
    }
    println("As we have handled the exception the value of x will be $x")
}

fun maxArea(shape1: Shape, shape2 : Shape) : Double{
    val areaShape1 = shape1.area()
    val areaShape2 = shape2.area()
    return if(areaShape1>areaShape2) areaShape1 else areaShape2
}
//For function overloading we just increase one more shape(e.g. triangle) in function parameter
//Ex: fun maxArea(shape1: Shape, shape2: Shape, shape3: Shape) : Double{--implementation--}

