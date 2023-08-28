// VISIBILITY MODIFIERS

// PUBLIC :-
// root level - Top level declarations - mein by default saari cheejien PUBLIC hoti hain
// mtlb usko kisi bhi function aur kisi bhi file ya module mein use kr skte hain
// Syntax -      public fun area() :Double = area

class P
public class Q
var a = 10
public var b = 20


// INTERNAL :-
//  Ye Module level mein bound kr deta hai
// mtlb within a same module it will act as PUBLIC but cannot be used on different projects
// Syntax -      internal variable/functions

internal class R
internal var c = 30

// PRIVATE :-
// ye file level mein boundation laga deta hai
// iska scope usi file level mein reh jaata hai
// agar uss class mein use hua hai toh usi class ke andar hi use hoga

private class D
private var d = 20

// PROTECTED :-
// isko hum top level decalaration mein use nahin kr skte hain
// ye classes ke andar kaam krega
 class E {
     protected fun ab() = 5
 }


// Example

open class cl1 ()
{
    public var p = 10
    internal var q = 20
    private var r = 30
    protected var s = 40
}

class testclass : cl1()
{
    fun test(){
        println(p)   // ye public tha toh access ho gya
        println(q)   // ye Internal tha toh iss poore module mein access ho jaayega
        //println(r)  // ye private hai superclass ka toh isme use nahin kr skte
        println(s)    // ye protected tha.. lekin inheritance ki wajah se access ho gya
    }
}

fun main() {
    val obj = testclass()
    obj.test()
}

