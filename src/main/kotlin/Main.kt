fun main() {
    print("Enter a number: ")
    val n = readln().toInt()
    println("\n $n ! is: ${fact(n)}")

}

fun fact(n:Int):Int{
    return if(n == 0){
        1
    }else{
        n * fact(n-1)
    }
}