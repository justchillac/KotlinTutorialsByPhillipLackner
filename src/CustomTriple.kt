//When we want to create generic classes then we should insert the generic type parameters
//Right after the class name
class CustomTriple<A: Any, B: Any, C: Any>( //"Any" can accept values of any type except null
    var first : A,
    var second: B,
    var third : C
){
    //printing the types of first, second and third
    fun printTypes(){
        println("The type of first is ${first::class}")  //"::class" allows you to get the type of variable
        println("The type of first is ${second::class}")
        println("The type of first is ${third::class}")
    }
}