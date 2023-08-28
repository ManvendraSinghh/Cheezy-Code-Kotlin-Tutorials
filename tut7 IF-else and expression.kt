fun main() {
    val x = 10
    val y = 11

    if (x > y){
        println("x is greater than y")
    }
    else if (x < y){
        println("x is smaller than y")
    }
    else
    {
        println("x is equals to y")
    }

//    In KOTLIN we can use IF-ElSE statements as Expressions too
    // assignment operator ke andar if else laga skte hain.. wo apne hisab se value le lega uski
    var result = if (x > y){
        "x is greater than y"
    }
    else if (x < y){
        "x is smaller than y"
    }
    else
    {
        "x is equals to y"
    }

    println(result)

    val number = 13
//    var res = if (number%2 == 0)
//    {
//        "even"
//    }
//    else
//    {
//        "odd"
//    }

//    humlog short krke ek hi line mein bhi likh skte hain
    var res = if (number%2==0) "even" else "odd"
    println(res)


}