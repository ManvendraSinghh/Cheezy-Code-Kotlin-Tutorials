// NESTED CLASSES

//  ek aisi class jiska khud se koi existence nahin hai
// but wo humesha OUTER class ke saath hi use ki jaayegi
// class ke andar class ko NESTED CLASS kehte
// aur agar OUTER class ki properties aur methods ko access krna chahte toh nested class ko INNER class bana dete
// INNER class ka object directly exist nahin krta
// pehle use parent class ka object banao phir use INNER class ka object banao


fun main() {
    val obj = Outer()
    println( obj.i )

    // making object of Nested class

//    val nested = Outer.Nested()
    //  ye error dega kyunki pehle outer ka object banao phir inner ko access kro
    val nested = Outer().Nested()
    nested.test()

}


class Outer{
    var i = 0

    inner class Nested{
        fun test(){
            println("I am in NESTED class ")
//            println("I am in NESTED class $i")
            // after writing inner as prefix
            println("I am using Outer class variable i.e i = $i")
        }
    }
    // nested class mein outer class ke keywords nahin use kr skte the
    // isliye concept aaya INNER ka.. taaki hum bta skein ki wo Inner class hia
    // aur use outer class ki cheejein bhi use krne do


}

