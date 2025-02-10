fun main(){
    val list = listOf(1, 2, 3, 4, 5)
    printList(list)
    println(multiply(4, 5))
    println(searchNum(4, list))
    var list1 = listOf(1, 2, 3, 4, 5, 6)
    println(list1.findProduct())
}

fun printList(list: List<Int>) = println(list)

fun multiply(a:Int, b:Int) = a*b

fun searchNum(num: Int, list: List<Int>): Int{
    for(i in 0..list.size){
        if(list[i]==num) return i
    }
    return -1
}

//Extension Function
fun List<Int>.findProduct(): Int{
    var product = 1
    for(number in 0 until this.size){
        product *= this[number]
    }
    return product
}