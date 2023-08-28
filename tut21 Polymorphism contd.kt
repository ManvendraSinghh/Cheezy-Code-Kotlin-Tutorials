// POLYMORPHISM
// Poly - many and Morph - Forms
// Method name is same but it will behave differently based on the object

// jaise method 'area' ke different forms the jo ki object pe depend kr rhe the ki kon sa kab call krna hai

// INHERITANCE and POLYMORPHISM goes hand in hand

fun main() {

    val cir1 = circle(4.0)
    val sq1 = square (4.0)
    val tri1 = triangle(4.0,3.0)
    PrintArea(cir1)
    PrintArea(sq1)
    PrintArea(tri1)
    println("Using For loop")
    val arr = arrayOf(circle(4.0),square (4.0),triangle(4.0,3.0))
    for (shp in arr)
    {
        PrintArea(shp)
    }


}



open class shap {
    open fun area(): Double = 0.0
}


// koi function mein agar parents class ka parameter defined hai toh
// Usme hum child class ke object bhi pass kr skte hain
// lekin agar child class ka parameter defined hai toh parents class ke object ko define nahin kr skte


fun PrintArea(shape : shape)
{
    println(shape.area())
}

class circl(val radius : Double) :shape()
{
    override fun area() :Double{
        return Math.PI * radius * radius
    }
}

class squar (val side : Double) :shape()
{
    override fun area():Double{
        return side * side
    }
}