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

    //Implementation of Custom Lambda Function is done in main class for some reason

    //Challenge: Implement a custom lambda function such that it takes a list of integers
    // and only sums up odd numbers
    var list1 = (1..10).toList()
    println(list1)

    fun List<Int>.customSum(sumFunction: (Int) -> (Boolean)): Int{
        var sum = 0
        for (i in this){
            if(sumFunction(i)){
                sum+=i
            }
        }
        return sum
    }

    var sum = list1.customSum{ it%2 == 1}
    println(sum)
}