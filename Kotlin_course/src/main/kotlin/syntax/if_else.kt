package syntax

fun main(){
    var sum = 600

    if (sum > 500){
        println("пицца")
    } else if (sum in 201..500){
        println("шаурма")
    } else {
        println("доширак")
    }

}


// Kotlin.Unit == Void (Java)