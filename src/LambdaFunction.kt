fun main(){
    var list : List<Int> = (20 downTo 1).toList()
    println(list)
    //Note: 'it' refers to each item in the list
    list = list.filter { it%2 == 0 }  //Returns only the even no. from the list
    //inside the filter brackets type Ctrl+P to check the parameter info
    //According to it : "it" is of Int type whereas the output true/false we are getting is of boolean type
    println(list)
    //Another example
    list = list.filter { it>8 }
    println(list)
    //Let's try one more lambda function
    list = list.sortedBy { it }
    println(list)
}