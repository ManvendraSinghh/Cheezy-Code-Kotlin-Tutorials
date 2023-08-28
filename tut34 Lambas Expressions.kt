// LAMBDA function -- Anonymous Functions -- any number of arguments

// last expression ka data type hi iska return type hoga
// Curly braces se usee lambda ka pta chl jaayega


fun main() {

    val lamda1 = { x: Int, y: Int -> x + y }
    val multilinelambda = {
        println("Hello lambda")
        val a = 2 + 3
        println("Hello there")
        2    // last expression ka data type hi lambda ka data type hoga
    }

    val sinlgeparamlambda = { x: Int -> x * x }

    // simplification of single parameter lambda
    val simplifySingleParam: (Int) -> Int = { it + it }    // it -> single parameter


    // if we defined data type explicitily
    val lambda2: (Int) -> Int = { x -> x * x }

    val sayHi = { msg: String -> println("Hello $msg") }

    multilinelambda()
    println(multilinelambda())


    calculator(1.0,2.0,{a ,b -> a+b})
    // it can be rewritten as
    calculator(1.0,2.0) { a, b -> a + b }

}

