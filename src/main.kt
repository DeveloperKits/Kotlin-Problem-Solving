import java.util.Scanner

fun main(){
    /*// add 2 with given number
    fun addTwo(x:Int) = x+2

    var listsOne = mutableListOf(1,3,5,7)
    var listsTwo = mutableListOf(2,4,6,8)

    val read = Scanner(System.`in`)
    print("Enter boolean value: ")
    val isEven = read.nextBoolean()

    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    val numberStrings = numbers.filter { it % 2 == 0 }.map { "Number $it" }
    println("Number $numberStrings")
    listsOne[1] = 11

    when {
        isEven -> listsOne = listsOne.map(::addTwo).toMutableList()
        else -> listsTwo = listsTwo.map(::addTwo).toMutableList()
    }

    when {
        isEven -> println(listsOne)
        else -> println(listsTwo)
    }

    for (i in listsOne){
        print("$i, ")
    }

    println()

    for (i in listsTwo){
        print("$i, ")
<<<<<<< Updated upstream
    }*/

    val obj = longest_Substring_Without_Repeating_Characters()
    println(obj.lengthOfLongestSubstring("p"))
=======
    }

    val array = intArrayOf(20, 15, 10)
    val max = getMax(*array)
    println("\nMaximum number $max")
}

fun getMax (vararg number: Int) : Int{
    var max = number[0]

    for (num in number){
        if (num > max) {
            max = num
        }
    }

    return max
>>>>>>> Stashed changes
}