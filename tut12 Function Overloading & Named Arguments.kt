import kotlin.math.pow

// FUNCTION OVERLOADING
// function overloading ka mtlb hai ki function same naam ke honge
// lekin uske arguments ka type alag hoga

fun addition(a: Int,b: Int) : Int
{
    return a+b
}

fun addition(a: Double,b: Double) : Double
{
    return a+b
}

// NAMED ARGUMENTS
// jab bahut saare arguments pass krne pad jaayein aur aap confuse ho ki kisme kon si value jaa rhi hai
// tab hum name likh ke arguments ka value assign kr skte hain

fun subt(a: Int,b: Int) : Int
{
    return a-b
}

fun power (a:Double,b:Double) :Double
{
    return a.pow(b)
}

fun main() {
    println(addition(3,2))
    println(addition(3.0,2.0))

    println(subt(a=6,b=2)) // Using NAMED ARGuments
    println(subt(6,2))
    println(subt(2,6))

    // We can also store functions in a Variable

    var fn: (num1: Int, num2: Int) -> Int =::add

    // fn ke andar 'add' function store ho chuka hai
    println(fn(6,5))

    var fn2 = ::power
    println(fn2(2.0,3.0))

    


}




