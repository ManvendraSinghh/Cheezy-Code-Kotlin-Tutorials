// NULL SAFETY
// String? -- Null value bhi accept krega
// Boolean? , Int? - Null values bhi accept krenge ye sab
// NULL == mtlb humein nahin pta ki value kya hogi

fun main() {
    var gender:String? = null
    var isAdult: Boolean? = true
    var gender1: String = "Male"

//    gender.UpperCase()  // null values mein methods call nahin krne deta
    if (gender != null) {
        gender.toUpperCase()
    }
    // agar uski properties aur methods ko use krna toh check for null krna padega pehle

    // Using SAFE CALL feature
    println(gender?.toUpperCase())

    // LET ek andar NOT NULL case mein hi jaayega
    // aur wahan "IT" variable us object ko hi point krega jo not null hai
    // LET ko hum LAMBDAS bhi kehte hain..jo ki different different hote hain


    gender1?.let {
        println("This is Line 1")
        println("Line 2 $gender1")
        println("Line 3 $it")  // here it ==> gender
    }

    // ELVIS Value -- mtlb agar wo null hai to koi deafult value le lo

    var selectedvalue = gender ?: "NA"

    // ASSERTION
    // chahe kuch bhi ho method call kr do
    // NULL hoga toh error aa jaayega
    // Tab use kro jab sure ho ki NULL nahin hoga
    var valueis = gender!!.toUpperCase()  // NULL Pointer Exception aa jayega







}
