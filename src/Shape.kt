open class Shape(
    var name: String
) {
    init {
        println("I'm the super class")
    }

    fun changeName(newName : String){
        name = newName
    }
}