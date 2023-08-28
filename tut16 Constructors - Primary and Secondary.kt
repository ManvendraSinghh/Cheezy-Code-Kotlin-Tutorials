// Constructors - Primary and Secondary
// It initializes the objects and provide default values to properties

fun main() {
    var car = Automobile("car",4,5,true)

    val person1 = Person("Hari",20)
    println(person1.name)
    println(person1.nameparam)
    println(person1.age)
    println(person1.canvote)

    println(car.airbags)


}

class Automobile(val name :String,val Tyres : Int,val Maxstg: Int , hasairbags :Boolean){
    init {
        println("$name is created")
    }

    // abhi hasairbags wali property nahin bani kyunki val/var bataya hi nahin to wo abhi normal parameter hai keval
    var airbags:Boolean = hasairbags  // ab wo property consider ki jaayegi
    fun drive(){}
    fun applybrakes(){}


    // jab bhi constructor ke andar "val" aur "var" likh denge tab wo property hogi
    // bina uske wo normal parameter hi hoga keval

    // Secondary Constructor ko banate samay proimary constructor ko call krni hi padti hai
    constructor(nameparam:String,airbags:Boolean) : this(nameparam,4,5,airbags)
    // tyres aur maxstg automatic le lega yahan se.. baaki do cheejein le lo idhar se
    

}

class Empty{}    // Empty class having no properties

class nPerson(val name:String,val age:Int) // ye bracket ke andar wala PRIMARY Constructor hai
{

}

// Passing properties by different method
// this method is used when we want to modify default values
class Person(val nameparam:String,val ageparam:Int)
{
    init {
        println("$nameparam is created")     // INITIALIZER BLOCK
    }

    val name:String = "$nameparam"+" Clan"  // it will take value from argument and modify it to save in properties
    var age:Int = ageparam

    init {
        println("Second Initiliazer block of $nameparam")
    }
    var canvote:Boolean = ageparam>18


}

// INITIALIZER BLOCK - "init" - jab bhi hum koi object banayenge toh wo set of statements by default run hoynengi hi






