// EMUM mtlb ki kuch set of values fix kr denge.. unho ko keval assign kra ja ske
// Ex - days naam ke variable ke liye Sunday,mon,tue.. etc values hi aa skein
// hum class ke kuch predeclared objects bana denge
// uske objects phir unhi mein se hi ban skenge

// enum ke case mein hum value ko restrict krte hain
enum class days(val num :Int){
    Sunday( 1) ,
    Monday( 2),
    Tuesday ( 3),
    Wednesday ( 4),
    Thursday( 5),
    Friday( 6),
    Saturday( 7);  // last value ke baad ; lagana padta hai

    fun printformattedday()
    {
        println("Day is $this")  // "this" points to the current object
    }
}

// SEALED CLASS ke case mein hum type ko restrict krte hain
// object kuch prefixed types ke hi ho skte hain




fun main() {
    val a= days.Monday
    println(a)
    println(a.num)  // uska number call kr liya
    a.printformattedday()

    // looping for every values
    for (i in days.values())
    {
        println(i)
    }

}
