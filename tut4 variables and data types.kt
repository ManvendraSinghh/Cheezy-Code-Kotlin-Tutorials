fun main() {
    var canbechanged = 5
    canbechanged = 10
    println(canbechanged)

    val cannotchanged = "hello world"
//    cannotchanged = "nahin hoga bhai"
    println(cannotchanged)

    // Do tarah ke variables hote hain kotlin mein..
    // 1. var - can be reassigned or changed
    // 2. val - can not be reassigned or changed

//    DATA Types
//    1. INTEGER
//          a. Byte
//          b. Short
//          c. Int
//          d. Long
//    2. Floating Point
//          a. Float
//          b. Double
//    3. Boolean (True , False)
//    4. Character
//          a. Char
//          b. String

//    we use ctrl + shift + P to know the data type of that variable
//    It uses TYPE INFERENCE so we dont have to explicitly define the data type of variable

//    It also uses TYPE CHECKING... pehle jo data type ka variable ban jaayega toh baad mein reassign bhi same type mein hoga
//    var a = 5
//    a = 3.14 then it will give an error as type should be same as of previous one

//    EXPLICITLY defining type of variables
    var a : Int = 5
    var b : Double = 4.35
    var c : Boolean = false
    var d : Char = 'A'
    var e : String = "Hello There"


}