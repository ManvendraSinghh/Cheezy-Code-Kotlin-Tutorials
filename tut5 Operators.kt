fun main() {
    var a = 13
    var b = 2

//    ARITHMATIC OPERATORS
    println(a+b)
    println(a-b)
    println(a*b)
    println(a/b) // dono integer type the isliye
    println(a.toFloat()/b) // kisi ek ko bhi float bana do
    println(a%b) // modulus remainder operator

//    RELATIONAL OPERATORS
    println(a<b)
    println(a>b)
    println(a<=b)
    println(a>=b)
    println(a==b)
    println(a!=b)

//    INCREMETER / DECREMENTER Operator
    var i = 10
    i = i+1
    i++
    println(i)
    i--
    println(i)
    //    Post Increment and PreIncrement
    i = 10
    println("Using Post and preincrement having i=10")
    // value is 11
    println(i++) // post increment - pehle value use phir update
    println(i)
    println(--i) // pre decrement - pehle decrement phir use
    println(i) // i = 10 again

    println(i++ + ++i) // 10 + 12 = 22

    

}