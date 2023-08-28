// OOPS started

// syntax of class
// class classname ( var/val property1 : type , var/val property2 : type , ... )
//  {
//      // syntax of methods
        // fun methodname () { ... }
//  }

// class ke andar jo functions bante hain unhein methods keh dete hain

// jis tarah se function call hoti hai waise hi class call hoti hai arguments ke saath


class car (val name : String, val type : String,val kmran : Int)
{
    fun drive()           // methods
    {
        println("$name Car is Driving")
    }
    fun applyBrakes()
    {
        println("Brakes are applied on $name") // accessing properties on methods
    }
}


// creating an object
fun main() {
    val mustang = car("Mustang Gt","Muscle Car",15)
    val hellcat = car("Dodge Challenger","Muscle Car",14)

    // now accessing the properties and methods of objects
    println(mustang.type)
    println(mustang.name)
    mustang.drive()
    println(hellcat.name)  // properties are called
    println(hellcat.kmran)
    hellcat.applyBrakes()  // methods are called

}
