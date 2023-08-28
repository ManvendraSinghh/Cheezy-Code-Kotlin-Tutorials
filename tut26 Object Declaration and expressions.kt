// Object Declaration
// humein agar multiple objects banane ho same tarah ke toh hum CLASS ka use krte hain
// lekin agar single object hi banana ho toh bin class banaye hi hum direct OBJECT bana skte hain
// Isse keval ek hi OBJECT bante hai

fun main() {
    val a3 = A1
    val a4 = A2
    println(A1.num)
    A2.test()

    SharingWidget.incrementinstalike()
    SharingWidget.incrementinstalike()
    SharingWidget.incrementtwitterlike()
    SharingWidget.incrementinstalike()
    SharingWidget.display()


    // Anonymous Class
    // We have used object directly as expression
    // humein isme object ka naam nahin batana padta
    // directly hi variable ko hum object bana dete hain
    var objj = object : cloneable {
        override fun clone() {
            println("I am Clone")
        }

        val ct :Int = 10
    }

    objj.clone()
    
    var obj2 = object : person("Wu") {
        override fun fullname() {
            super.fullname()
            println("Anonymous - $name")
        }
    }

    obj2.fullname()

}

object A1{
    val num: Int = 10
}

object A2 {
    fun test(){
        println("This is Object A2")
    }
}

// Singleton Pattern -- jab ek class ka ek hi object ban paaye

// humne isko object method se isliye banaya taaki.. bahut saari classes aisi na ho jo likes ke count
// ko le kr baithi ho.. toh alag alag jagah increments hone se exact count nahin pta chlegi
// isiliye humne aisi class banayi jiska ek hi object ho skta hai "object ___" ki madad se
// taaki saare counting ek hi jagah pe store rhe

object SharingWidget
{
    private var instalikes = 0   // taaki likes ke count ko koi bahar se chhed na ske
    private var twitterlikes = 0
    fun incrementinstalike() = instalikes++
    fun incrementtwitterlike() = twitterlikes++
    fun display() = println("Instagram - $instalikes & Twitter - $twitterlikes")

}

// Anonymous class
interface cloneable{
    fun clone()
}

open class person(val name:String){
    open fun fullname() = println("full name - $name Shang Clan")
}
