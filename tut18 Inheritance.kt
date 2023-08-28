// INHERITANCE

// Aisi kon si classes hain jjinko hum common bana skte hain kisi apllication mein
// toh hum wahan pe inheritance ki madad se duplicacy of code ko rok denge
// aur specific methods aur properties hi define krenge jo nayi hain

// "open" before "class" allows that class to be inherited in others

// Kotlin mein Single Parent ho skta ek Child class ka - Single Inheritance

fun main() {
    var obj = child() // ye define krte ke saath constructors call ho gye dono ke by default

    obj.mymethod()
    obj.mymethod2()

    // obj define child class mein gya tha lekin usme parent class ki bhi property aa gyi hai


}

open class parent()  // we have to use "open" to allow it to be inherited
{
    init {
        println("Constructor of parent is called")
    }
    val name : String = ""

    fun mymethod(){
        println("I am in Parent")
    }
}

class child : parent()    // way to show inheritance
{
    init {
        println("Constructor of child is called")
    }
    val name2 : String = ""

    fun mymethod2(){
        println("I am in Child")
    }
}