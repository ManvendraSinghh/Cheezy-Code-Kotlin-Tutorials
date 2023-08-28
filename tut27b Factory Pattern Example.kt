fun main() {
    var pizza1 = Pizza.Factory.create("Peppy Paneer")

    // Here i am calling via facroy referencen = Dont want to use factory ref-
    // Now after defining that as companion
    var pizza2 = Pizza.create("Tomato")
    println(pizza2)

    // one more thing we can do - We want everyone to call this create method if they want Pizza
    // for that we will  mark the constructor as private
//    var piiza3 = Pizza.() // Now everyone needs to call create method
    // i.e. everyone has to call its factory

}

// Example of factory pattern using companion

class Pizza private constructor(val type : String , val topping: String){
    companion object Factory {  // this is the factory object
        fun create ( pizzaType: String) : Pizza {
            return when(pizzaType){
                "Tomato" -> Pizza("Tomato","Tomato Cheese")
                "Peppy Paneer" -> Pizza("Paneer Farm" , "Paneer , Cheese Burst , Tomato , Onion")
                else -> Pizza("Basic" , "Onion , Cheese")
            }
        }
    }

    override fun toString(): String {
        return "Pizza(type = '$type' , toppings = '$topping'"
    }

}