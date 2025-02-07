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

    //Trying out string operations
    var string = "Hello everyone, I'm atharva"
    println(string.uppercase())

    //Checking if a string is palindrome
    var str = "ballab"
    if(str == str.reversed()) print("$str is a palindrome") else print("$str is not a palindrome")

    //Finding fibonacci sequence till n using list
    var list = mutableListOf<Int>()
    val n = readLine()?.toInt()
    list.add(0)
    list.add(1)
    if(n != null){
        for(i in 2..n){
            var curr = list[i-1] + list[i-2]
            list.add(curr)
        }
    }
    //To print the list
    if(n != null){
        for(i in 0..n){
            print(list[i].toString() + " ")
        }
    }

}