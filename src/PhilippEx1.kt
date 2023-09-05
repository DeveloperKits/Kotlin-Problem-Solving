
fun main(){
    print("Enter the number of integers that you want to input: ")
    val number = readln().toInt()
    val numbers = mutableListOf<Int>()

    for (i in 1..number){
        print("Enter $i integer: ")
        val input = readln().toInt()
        numbers.add(input)
    }

    println("\nList of numbers : $numbers \n\nYour product result = ${product(numbers)}")


}

fun product(numbers: MutableList<Int>): Int{
    var num = 1
    for (i in numbers){
        num *= i
    }

    return num
}