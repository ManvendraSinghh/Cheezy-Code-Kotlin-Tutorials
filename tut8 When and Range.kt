fun main() {
    val i = 5
//    RANGE
    var result = i in 1..5  // 1..5 means 1,2,3,4,5 mein check krega
    println(result)
    result = i in 1 until 5 // last count nahin krega means 1,2,3,4 mein check krega
    println(result)

//    WHEN Statement

    // normally humlog IF-ELSE ladder use krte, uski jagah ye kr sktein

    val animal = "goat"

//    if (animal == "cow")
//    {
//        println("Animal is Cow")
//    }
//    else if (animal == "goat")
//    {
//        println("Animal is MESSI")
//    }
//    else if (animal == "dog")
//    {
//        println("Animal is Dog")
//    }
//    else {
//        println("Aniaml Not Found")
//    }

    // Ab hum log iski jagah use krenge When ka
    when (animal){
        "dog" -> println("Animal is Dog")
        "goat" -> println("Animal is MESSI")
        "cow" -> println("Animal is cow")
        else -> println("Animal not found")
    }

    // We cam also use WHEN as Expression
     var res = when (animal){
         "dog" -> "Animal is Dog"
         "goat" -> "Animal is MESSI"
         "cow" -> "Animal is cow"
         else -> "Animal not found"
     }
    println(res)

     // Example 2
    val num = 15
    val resu = when(num) {
        10 -> "ten"
        11 -> "eleven"
        12 -> "twelve"
        in 13..19 -> "teen"  // using in range in conditions
        else -> "not in range"
    }
    println(resu)

    
}