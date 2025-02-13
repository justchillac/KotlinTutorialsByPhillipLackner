abstract class T(
    var name: String
) {
    constructor(name: String, vararg dimensions: Int) : this(name)

    init {
        println("I'm the super class")
    }

    abstract fun area() : Double

    abstract fun perimeter() : Double

    fun changeName(newName : String){
        name = newName
    }
}