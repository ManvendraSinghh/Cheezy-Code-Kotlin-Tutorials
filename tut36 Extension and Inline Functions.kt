// EXTENSION -- classes ke andar properties and methods baad mein bhi add kr skte ho


fun main() {
    println("Hello there !".formattedString())

    // INLINE Functions

    calculatetimeandrun {
        loop(10000000)
    }

    // lambda functions ke liye class aur object banti phir execute hota
    // lekin INLINE use krne se wo bas code replace kr deta har jagah
    // Class aur object banane ki need na padti

}


// classname . naya method jo add krna hai
fun String.formattedString()  : String // return type
{
    // 'this' represents the input of it
    return "----------------------\n$this\n----------------------"
}
// Iss method ka use krke aap class ke PRIVATE variables access nahin kr

// ye ek naya extension function ban gya string class ke liye
// jaise aap chahte ho string ko ek particular taah se use krna apne app mein
// lekin waisa krne ke liye string class mein koi method na ho
// tab aap khud ka naya extension method banake string class mein add kr skte


// INLINE Fucntions
// bina objects banaye wo function ka same code har uss jagah copy paste kr deta hai
// jahan jahan bhi uss function ka use hota hai


fun loop(n:Long)
{
    for (i in 1..n)
    {
        //
    }
}

// Isme class aur object bana ke kaam ho rha hota
//fun calculatetimeandrun ( fn: () -> Unit)
//{
//    val start:Long = System.currentTimeMillis()
//    fn()
//    val end:Long = System.currentTimeMillis()
//    println("Time taken ${end - start}ms")
//}

inline fun calculatetimeandrun ( fn: () -> Unit)
{
    val start:Long = System.currentTimeMillis()
    fn()
    val end:Long = System.currentTimeMillis()
    println("Time taken ${end - start}ms")
}