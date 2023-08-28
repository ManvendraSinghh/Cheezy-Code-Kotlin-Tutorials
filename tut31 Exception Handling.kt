// EXCEPTION HANDLING

// jab hum chahte ho ki error aane par app crash na ho balki Error display krde
// ex- database se conncet na kr paaye tph error show krde naa ki crash ho jaaeye

// We use TRY - CATCH - FINALLY for exception handling

// TRY == aisa code jisme error aa skti hai
// CATCH == agar try krne mein exception aaye toh usko iss block mein handle krna hota hai
             // iska input argumnet hi exception hota hai.. kyunki ye usko hi process krta hai
// FINALLY == Exception aaye ya na aaye.. Finally ke andar toh jaayega hi jaayega exceution ke liye

import java.lang.Exception
import java.lang.IllegalArgumentException

fun main() {
    val arr = arrayOf(1,2,3)

    // try - catch  ya try - finally  ya  try - catch - finally
    // kabhi bhi try akela nahin aayega
    try {
        // Exception ke liye check krega
        println(arr[5])

    }

    // we can even use multiple catch blocks
    // we can make separate catch blocks for different exceptions
    // multiple catch block likhte samay
    // specific wale pehle likhne hote hain
    // base class "Exception" wali sabse last mein likhni hoti hai
    catch (ex :NullPointerException){
        println("NUll wala error aa gya")
    }
    catch (e:Exception){
        // agar exception aayi toh kya krega
        println("Please check the index")
    }

    finally {
        println("I will execute no matter what")
    }

    println("If it Prints - then program doesn't crashed after exception")

    createuserlist(5)
    createuserlist(-2)

}

// THROW == to raise an exception intentionally

fun createuserlist(count:Int){
    if (count <0){
        // Exception Raise
        throw IllegalArgumentException("Count must be greater than 0")    // raising an error for argument
    }
    else{
        println("User List created containing $count users")
    }
}