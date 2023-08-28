// Type checking and Smart Casting
// Type checking is used to check the class of an object at runtime using 'is'

fun main()
{
    val circle = Circle1(3.0)
    val square = square1(4.0)

    // Type checking
    if (circle is Circle1)
    {
        println("This is Circle")
    }

    // Smart Casting
    val array = arrayOf(Circle1(4.0) , square1(3.0))
    val array2 = arrayOf(square1(3.0))
    val array3 = arrayOf(Circle1(4.0) )
    val array4= arrayOf(Circle1(4.0),Player1("hello"))

    for (obj in array4)
    {
        if (obj is Circle1)
        {
            println(obj.area()) // kotlin ne khud draggable ko circle bana diya hai aur uske method use krne de rha
        }
        else{
            // yaha pe wo identify nahin kr paa rha ki obj kis class ka hoga toh keval draggable ke methods dikha rha
            (obj as Player1).saymyname()  // humne smart cast kr diya obj ko as Player1
            // agar kisi aur class type ka bhi obj hota toh error throw kr deta ki "can't cast into Player1"
        }

    }





}

interface Draggable {
        fun drag()
}

abstract class Shape1:Draggable
{
    abstract fun area() :Double
}
class Circle1(val radius :Double) : Shape1()
{
    override fun area(): Double = Math.PI * radius * radius
    override fun drag() {
        println("Circle is dragged")
    }
}

class square1(val side :Double) : Shape1()
{
    override fun area() :Double = side *side
    override fun drag(){
        println("Square is dragged")
    }
}

class Player1(val name : String) : Draggable
{
    override fun drag() {
        println("$name is dragging")
    }
    fun saymyname() = println("My name is $name")
}
