// GENERICS
// hum chahte hain ki type specific classes na ho
// Int , String ... sabke liye ek hi class se kaam chl jaaye


// previously

// ek CONTAINER bana hai lekin keval INT Type ke liye hi
class IntContainer(var data:Int)
{
    fun setValue(value :Int)
    {
        data = value
    }
    fun getValue(): Int{
        return data
    }
}

// ek CONTAINER bana hai lekin keval String Type ke liye hi
class StringContainer(var data:String)
{
    fun setValue(value :String)
    {
        data = value
    }
    fun getValue(): String{
        return data
    }
}

// toh hum Type Unspecifc container banana chah rhe hain
// GENERIC CLASS

class Container <T> (var data : T){
    fun setValue(value : T)
    {
        data = value
    }
    fun getValue() : T{
        return data
    }
}


fun main() {
    val obj = IntContainer(3)
    println( obj.getValue())

    // GENERIC CLASSES
    val genobj = Container(3.0)
    println( genobj.getValue())
    val genobj1 = Container(3)
    println( genobj1.getValue())
    val genobj2 = Container(true)
    println( genobj2.getValue())
    val genobj3 = Container("Hello")
    println( genobj3.getValue())


    // VARAG
    println("VARAG")
    add(2,1,2)
    add(5,8,7,9,6,2,4,1,5,5)


}


// VARARG
// Variable Arguments
     // It will take array as argument


fun add(vararg values : Int)     // we can give multiple arguments as input - it will take it as array
{
    var sum = 0
    for (i in values)
    {
        sum += i
    }
    println(sum)
}
