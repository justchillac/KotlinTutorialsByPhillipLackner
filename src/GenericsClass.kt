fun main(){
    //Refactor everywhere shortcut key is F2
    //The generic type T given below acts as a placeholder for any type


    //Printing the shapes list
    val circle = Circle(5.0)
    val circle2 = Circle(10.0)
    val rect2 = Rectangle(5.0)
    val rect3 = Rectangle(5.0)
    var shapes = listOf(circle, circle2, rect2, rect3)

    //The Triple does nothing more than saving three values of any type
    val triple = Triple<Int, String, Boolean>(3, "Hello", true)
    //Passing Several Type Parameters
    //The implementation for the CustomTriple is done in a seperate kotlin class, check it out to understand how it works
    var customTriple = CustomTriple<Int, String, Boolean>(42, "Hello", true)
    customTriple.printTypes()

    //This customFilter works exactly same as the .filter function
    shapes = shapes.customFilter { it.area()>=50.0 }
    for(shape in shapes){
        println("${shape.name} is a shape with area ${shape.area()} that is greater than 5.0")
    }

    var integers = (1..20).toList().customFilter{it>=4}
    for(i in integers){
        print(i)
        print(" ")
    }
}

//The <T> given below denotes the Generic type
//Suppose we change it to <T: Shape> it will again be applicable to Shapes only
//If we change it to <T: Number> it will be applicable to every no. (e.g. Int, float, double cause these
//are subclasses of the class Number)
fun <T> List<T>.customFilter(filterFunction: (T) -> (Boolean)): List<T>{
    val resultList = mutableListOf<T>()
    for(item in this){
        if(filterFunction(item)){
            resultList.add(item)
        }
    }
    return resultList
}

//In Phillip Lackner's Generics video he has explained how using generic types(e.g <T>) instead of <Int>
//can cause some problem which can be solved of course but has to be solved manually
//The problem he mentioned was when we replace <Int> with <T : Number> we don't know what we should intialize
//sum with,e.g. whether it should be 0 or 0.0 cause <T: Number> can mean anything(e.g. integer, double, float)
//Finally always remember generics is a vast topic, so only knowing what is required for us and understanding the
//core concept should be enough
fun List<Int>.customSum(sumFunction: (Int) -> (Boolean)): Int{
    var sum = 0
    for(item in this){
        if(sumFunction(item)){
            sum+=item
        }
    }
    return sum
}