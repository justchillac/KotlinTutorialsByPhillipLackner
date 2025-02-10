abstract class Shape(
    var name: String
) {
    init {
        println("I'm the super class")
    }

    abstract fun area() : Double

    abstract fun perimeter() : Double

    fun changeName(newName : String){
        name = newName
    }
}