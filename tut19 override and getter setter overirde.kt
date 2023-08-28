// OVERRIDE

// aisi cheejien jo humein parents se mili hain lekin humein usm ekuch changes krne hain
// tab hum override ka use krte hain

// agar koi property ko hum allow krein modification ke liye child classes mein
// toh uske aage "open" likh denge

fun main() {
    val op = oneplus("smartphone")
    op.display()
    println(op.name)
    println(op.size)
    println(op.type)
    println(op.toString())



    val mob = phone("Basic Phone")
    mob.display()
    println(mob.name)
    println(mob.size)
    println(mob.type)


}

open class phone( val type : String)
{
    open val name : String = ""
    open val size : Int = 5
    fun makecall() = println("Calling from Mobile")
    fun poweroff() = println("Shutting Down")
    open fun display() = println("Simple Mobile Display")     // isko humne modifications ke liye allow kr diya

}

// jab bhi hum parents class ko inherit krenge toh
// humien uss prants class ke saare constructors ki value pass krni padegi
// phone class ko inherit kiya toh type ki value pass krni padi

class oneplus (paratype: String) : phone(paratype)    // oneplus ke parameter se value lekar parent class ke arg mein pass kr di

{
    override fun display(){
        super.display()   // parents class ki default values print krne ke liye
        println("One plus display")
    }// hum bta rhe ki hum modify kr rhein parents class ki cheejo ko
    override val name : String = "One Plus"
    override val size: Int = 6
    override fun toString(): String {
        return "$name - $size inch - $type "
    }
    //  we can also override the Any properties which are inherited
    // alt + insert dabake bhi hum methods ko insert kr skte hain
}

// har ke class ka super class hai "Any" class in kotlin
// methods defined in "Any" class is inherited to all the classes

// getter setter overrides sahi se nahin hue