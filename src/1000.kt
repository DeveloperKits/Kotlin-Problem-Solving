fun main(){
    println("Hello World!")

    val num = 29
    var flag = false
    for (i in 2..num / 2) {
        // condition for nonprime number
        print("i=$i, ")
        if (num % i == 0) {
            flag = true
            break
        }
    }

    if (!flag)
        println("$num is a prime number.")
    else
        println("$num is not a prime number.")
}