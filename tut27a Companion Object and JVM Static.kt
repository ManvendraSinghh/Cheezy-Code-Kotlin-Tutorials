// COMPANION - hum uski cheejein use kr skte hain directly
// hum class ke andar bhi "object" ka use krke singleton object bana skte hain
// usme hum companion use krke dirctly hi super class se usko use kr skte hain
// real life mein bhi humara ek hi companion hota hai wise hi yahan ek class ka ek hi companion hota hai
// one companion -- one class


fun main() {
    Myclass.myobject.f()
    Myclass.anotherobject.b()
    Myclass.c() // we dont need to call thirdobj for it as it was companion
    Myclass.thirdobj.c() // aise bhi kaam krega lekin koi need nahin hai
}

class Myclass{
    object myobject{
        fun f()
        {
            println("I am f from myobject")
        }

    }

    object anotherobject{
        fun b()
        {
            println("I am b from another object")
        }
    }

    companion object thirdobj{      // using companion
        @JvmStatic
        // hum bta rhein hain ki isko Static object hi smjho java mein
        fun c()
        {
            println("I am c from thirdobj")
        }
    }
}