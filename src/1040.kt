
fun main(){
    val a = readLine()
    val b = readLine()
    val c = readLine()
    val d = readLine()

    var avg = (a.toString().toFloat()*2 + b.toString().toFloat()*3 + c.toString().toFloat()*4 + d.toString().toFloat())/(10.0)
    println("Media: " + "%.1f".format(avg))

    when {
        avg >= 7.0 -> {
            println("Aluno aprovado.")
        }
        avg < 5.0 -> {
            println("Aluno reprovado.")
        }
        else -> {
            println("Aluno em exame.")
            val extra = readLine()
            println("Nota do exame: $extra.")

            avg = (avg+extra.toString().toFloat())/2.0

            when {
                avg >= 5.0 -> {
                    println("Aluno aprovado.")
                }
                else -> {
                    println("Aluno reprovado.")
                }
            }

            println("Media final: " + "%.1f".format(avg))
        }
    }
}