// FOR Loop
// jab humko pta ho ki iterations kitni baar chalani hain toh for loop se easily ho jaata


fun main() {

    println("Normal For loop")
    for (i in 1..5)
    {
        println(i)
    }
    // normally 1,2,3,4,5 ke liye print kr dega


    println("Until")
    for (i in 1 until 5)
    {
        println(i)
    }
    // last chhod dega.. 1,2,3,4 ke liye print krega


    println("with step")
    for (i in 1..5 step 2)
    {
        println(i)
    }
    // +2 ka increment kr dega 1,3,5 ke liye chlega

    println("For decrement")
    for (i in 5 downTo 1)
    {
        println(i)
    }
    // decrement ke liye.. 5,4,3,2,1 ke liye print krega

    println("For decrement with step -2")
    for (i in 5 downTo 1 step 2)
    {
        println(i)
    }
    // decrement with 2 step ke liye.. 5,3,1 ke liye print krega


    // printng table

    val num = 2
    for (i in 1..10)
    {
//        println(num + " X "+ count + " = " + num*count)
        // It will throw am error as we cant concatenate int and string
        // we have to explicitly convert int into string using .toString() function
//        println(num.toString() + " X "+ i.toString() + " = " + (num*i).toString())


        // We will be using the concept of STRING TEMPLATING
        println("$num X $i = ${num * i}")
        // stirng ke andar hi '$' sign variable ko represnt krta hai {} se hum values ka operation bhi kara skte hain

        
    }





}