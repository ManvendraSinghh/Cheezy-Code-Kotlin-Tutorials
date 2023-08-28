// Polymorphism
// Parent can hold references to the child and can call methods of the child (which are common)
// reference variabkle humne parents class ka banaya lekin jo methods humne call kiye wo child class ke the

fun main() {
//    val circle: circle = circle(4.0)
    val circle: shape = circle(4.0)
//    val square:square = square(4.0)
    val square:shape = square(4.0)  // reference type parent class ka rkha hai phir bhi child class ke methods call ho rhein

    println(circle.area())
    println(square.area())

    val shapes = arrayOf(circle(4.0),square(4.0),circle(3.0),triangle(4.0,3.0))   // creating array of shapes class
    calculateareas(shapes)

    // naye naye shapes banake array mein add krte jao wo automatic override krke usi ka area nikal dega
    // humein bas object ko parent class ka banana hai.. jaise yahan 'shapes' class ka banaya gya

}

fun calculateareas(shapes : Array<shape>) {   // array ko input lega
    for (shape in shapes)   // array ke ek ek element ko shape banayega
    {
        println(shape.area())   // uss element ke liye area print kr dega
    }
}


open class shape{
    open fun area() : Double
    {
        return 0.0
    }
}

class circle (val radius: Double) :shape()
{
    override fun area() : Double{
        return Math.PI * radius * radius
    }
}

class square (val side : Double) :shape()
{
    override fun area():Double
    {
        return side * side
    }
}

class triangle (val base:Double,val height:Double) :shape()
{
    override fun area() :Double{
        return 0.5 * base * height
    }
}