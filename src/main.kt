import java.util.Scanner

fun main(){
    /*// add 2 with given number
    fun addTwo(x:Int) = x+2

    var listsOne = mutableListOf(1,3,5,7)
    var listsTwo = mutableListOf(2,4,6,8)

    val read = Scanner(System.`in`)
    print("Enter boolean value: ")
    val isEven = read.nextBoolean()

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
    }*/

    val obj = longest_Substring_Without_Repeating_Characters()
    println(obj.lengthOfLongestSubstring("p"))
}