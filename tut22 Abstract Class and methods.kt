// ABSTRACT
//

fun main() {
//    val shape = Shape()   cannot create instance of abstract class

}

// Jis method ya property ki humein body nahin pata hoti use hum abstract bana dete hain
// abstract ka mtlb hai ki uski body child class batayengi
// abstract == incomplete
// kisi class mein abstract methods ya properties hain toh wo class bhi incomplete ho jaayegi
// uss class ko bhi huemin abstract banana padega
// phir uss class ka koi object nahin ban paayega.. uske child ke ban jaayenge
// override ka use krke abstrct ki value dete hain

// Abstract class can have both abstract and non abstract properties & methods
// If a class has abstract method or properties then class must be declared as abstract


abstract class Shape2 (){

    open var name :String = ""
    abstract fun area ():Double
    open fun display() = "Shape is getting Displayed"
}

class Circle2 (val radius : Double) :Shape2()
{
    override fun area():Double = Math.PI * radius * radius
}

abstract class A{
    fun method1(){
        println("i am Method")
    }
}

// hum kisi class ko abstract bhi bana skte hain.. usmein abstract methods hue bina bhi..
// taaki uss class ka koi object na bana paaye aur uske methdods ko inherit krke hi use kr paaye
