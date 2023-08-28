// FUNCTIONS
// Syntax :-
//      fun Function_Name(parameter_1 : type, parameter_2 : type, ....):ReturnType
//      {
//          Block of statements
//          return result
//      }

// Agar function mein return nahin hai toh wo 'Unit' type ka hoga.. aur wo bydefault le lega unit type
// humein alag se batane ki jarurat nahin hogi

fun OddorEven(num : Int)
{
    val result = if(num%2==0) "even" else "odd"
    println(result)
}

fun add(num1: Int,num2 : Int):Int
{
    // num1 aur num2 are parameters
//    parameters ko reasssign nahin kr skte hain.. jo values pass hoke aayi hain wohi rhegi
    val result = num1 + num2
    return result
}

// ek line mein bhi bana skte hain functions
fun sub(num1: Int,num2: Int) = num1 - num2

// !! Important concept     !!
// DEFAULT ARGUMENTS
fun printmessage(count : Int = 2){
    for( i in 1..count) {
        println("Hello $i")
    }
}



fun main() {
    // ispe jo value bhejte hain wo arguments hote
    println(add(5,6))
    println( add(8,2))
    OddorEven(5)
    OddorEven(14)
    println( sub(5,2))
    println(sub(3,7))
    printmessage(5)
    println("Without argument mein wo by default 2 le lega")
    printmessage()

}