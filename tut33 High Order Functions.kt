// Object Oriented -- Har cheej ka use object bana ke hi krte hain
// Functional  -- har cheej ka use functions bana ke hi krte hain, arguments pass krke

// Functions are "First Class Citizens"

// we use  "::" for saving a function into a variable

fun sum(a:Double,b:Double):Double
{
    return a+b
}

fun pow(a:Double,b:Double):Double
{
    return Math.pow(a,b)
}

fun fnc(a:Int){}

fun main() {
    println(sum(2.0,3.0))
    println(pow(2.0,3.0))

    var fn: (a: Double, b: Double) -> Double = ::sum
//    var fn: (a: Double, b: Double) -> Double = ::fnc
    // it is giving error because of Type Mismatching
    println(fn(2.0,3.0))

    println("\nHIGHER ORDER FUNCTIONS :-\n")
    calculator(5.0,5.0,::sum)    // argument mein function :: ye use krke likhte hain

}

// HIGHER ORDER FUNCTIONS
// functions that accepts functions as argument or return functions or both
// Input mein functions le rha ho, ya Output mein functions de rha ho ya dono kr rha ho

// input mein function bhej rhe hain

fun calculator(a: Double,b: Double,gn : (Double,Double) -> Double){
    val result = gn(a,b)
    println(result)
}
