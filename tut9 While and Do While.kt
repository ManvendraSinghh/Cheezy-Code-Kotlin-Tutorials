// there are two ways for loops
//1. While
//2. Do While

fun main() {
    // WHILE LOOP se krne ka tareeka
    // Entry Control loo[
    val number = 2
    var i = 1
    while (i<=10)
    {
        println(number * i)
        i++
    }
    println("Outside loop value of i : "+ i)

    // DO WHILE Loop se krne ka tareeka
    // Exit Control Loop

    var index = 5
    do {
        println("condition passed")
    }while(index<5)
    // isme ek baar wo task krega hi karega.. uske baad condiotion check krega ki sahi bhi hai ki nahin
    // isiliye ek baar isne bina condition check kre print kr diya phir ruk gya agle mein
    


}