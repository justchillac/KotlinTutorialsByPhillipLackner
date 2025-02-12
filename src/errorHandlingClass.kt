fun main(){
    //Creating default Exception Class
    class DivisionByZeroException : Exception("The number cannot be divided by zero")

    fun divide(a: Double, b: Double): Double{
        if(b == 0.0) throw DivisionByZeroException()
        return a/b
    }

    val x = try {
        divide(5.0, 5.0)
    } catch (e: DivisionByZeroException){
        0.0
    }
    println("The result of division in $x")
}