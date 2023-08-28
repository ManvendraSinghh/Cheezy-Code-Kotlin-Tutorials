// Getters and Setters and Lateinit

fun main() {
val ob = Calculator()
    println(ob.add(2,3))

    val p1 = Perso("aaa",12)
    val p2 = Perso("bbb",10)

    p2.age=-3
    // ispe setter laga hua hai to change nahin ho rhi hai -3 mein
    // jab bhi uss property ko set kroge aise toh setter kaam krega

    println( p2.name)
    // get wale mein getter laga hua hai.. jab bhi uss property ko get kroge aise toh wo kaam krega


}

class Calculator(){

    lateinit var message:String  // Isse humne bata diya ki isko hum baad mein initialze krenge
    // ye lateinit properties 'val' type ki nahin ho skti aur inko int, bool aur float nahin bana skte

    fun add(a:Int,b:Int) : Int{
        return a+b
    }

    fun mul(a:Int,b:Int) : Int{
        return a*b
    }

}

// Getters - property ki value get krne ke liyr hm iska use krte
// Setters - properties ki values set krte samay usko validate krne ke liye use kr skte
// jaise koi age negative bhi set kr skta toh usko prevent krne ke liye

class Perso(nameparam:String,ageparam:Int)
{
    var name:String = nameparam
        get() {
            return field.uppercase()
        }

    // jisme setter lagana just uske neeche hi likh lo

    var age:Int = ageparam
    set(value){
        if(value>0)
        {
            field = value  // 'field' mein value set krna mtlb accept kr lena property ki value ko
        }
        else
        {
            println("age can't be negative")
        }
    }

    // It is the DEFAULT getter and setter which kotlin assigns to every property
    var email:String = ""
        get() {
            return field
        }
        set(value) {
            field = value
        }

}