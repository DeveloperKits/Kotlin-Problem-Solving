class longest_Substring_Without_Repeating_Characters {
    fun lengthOfLongestSubstring(s: String): Int {
        var count = 0
        if (s.length == 1){
            println("Length = ${s.length}")
            count = 1
        } else if (s.isNotEmpty()) {
            val totalStringList = s.map { it.toString() }
            val store = mutableListOf<String>()
            store.add(totalStringList[0])

            for (i in 1 until totalStringList.size) {
                for (j in 0 until store.size){
                    if (store[j] == totalStringList[i]){
                        store.clear()
                        store.add(totalStringList[i])
                        if (store.size > count){
                            count = store.size
                        }
                        break
                    }

                    if (j==store.size-1){
                        store.add(totalStringList[i])
                        if (store.size > count){
                            count = store.size
                        }
                        println("List = $store")
                    }
                }
            }

            store.clear()
            store.add(totalStringList[totalStringList.size-1])
            for (i in totalStringList.size-2 downTo 0) {
                for (j in 0 until store.size){
                    if (store[j] == totalStringList[i]){
                        store.clear()
                        store.add(totalStringList[i])
                        if (store.size > count){
                            count = store.size
                        }
                        break
                    }

                    if (j==store.size-1){
                        store.add(totalStringList[i])
                        if (store.size > count){
                            count = store.size
                        }
                    }
                }
            }
        }
        return count
    }
}