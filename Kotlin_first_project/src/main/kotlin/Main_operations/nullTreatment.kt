import java.util.*

fun main (){
    val answer = nullTr("My question")

    println(answer!!.uppercase(Locale.getDefault()))            // ставим !!, если уверены, что не придет null
}

fun nullTr (question: String): String?{             // ставим ?, если возможно будет null в возвращаемом значении
    var answer: String? = "gg"                  //ставим ?, если возможно будет null

    if(question.length < 10){
        println("This is an answer")
    }

    return answer
}