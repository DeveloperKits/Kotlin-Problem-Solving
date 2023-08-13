fun main(){
    val nums = arrayOf(-3,4,3,90)
    val target = 1

    val returnnums = IntArray(2)
    var off = false

    for ((i, e) in nums.withIndex()){
        for (x in nums.indices){
            if (i != x){
                val sum = e + nums[x]
                //println("Sum = $sum, i = $i, x = $x")

                if (sum == target){
                    if (i>x){
                        returnnums[0] = x
                        returnnums[1] = i
                    }else{
                        returnnums[0] = i
                        returnnums[1] = x
                    }
                    println("${returnnums[0]} , ${returnnums[1]}")
                    off = true
                    break
                }
            }
        }

        if (off){
            break
        }
        /*if (e <= target){

        }*/
    }
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    val returnnums = IntArray(2)
    var off = false

    for ((i, e) in nums.withIndex()){
        if (e < target){

            for (x in nums.indices){
                if (i != x){
                    val sum = e + nums[x]

                    if (sum == target){
                        if (i>x){
                            returnnums[0] = x
                            returnnums[1] = i
                        }else{
                            returnnums[0] = i
                            returnnums[1] = x
                        }
                        off = true
                        break
                    }
                }
            }

            if (off){
                break
            }
        }
    }
    return returnnums
}

