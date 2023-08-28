import javax.xml.stream.StreamFilter

// Collection Functions - .forEach() , .map() , .filter()
// Use of Lambdas

// FILTER - aisa function leta hai jo input leta hai Int aur Output deta hai Boolean
//        - one by one har element mein loop krta hai aur wo condition check krta hai

fun main() {

    val nums = listOf(1,2,3,4,5)

//    fun isodd(a:Int):Boolean{
//        return a%2!=0
//    }
//    val list = nums.filter(::isodd)


    // Directly bhi hum pass kr skte hain

//    val list = nums.filter ( fun(a:Int):Boolean{
//        return a % 2 != 0
//    } )


    // Lambda bhi pass kr skte hain

//    val list = nums.filter({a:Int -> a %2 != 0 } )
//    val list = nums.filter { a: Int -> a % 2 != 0 }
    val list = nums.filter { it % 2 != 0 }



    println(list)

    val userlist = listOf(
        User(1,"A"),
        User(2,"B"),
        User(3,"C"),
        User(4,"D")
    )
    println(userlist.filter { it.id==3 })

    // id == 3 wala filter out hoke aa jaayega

    // MAPS --> har ek element ko transform kr dega
    val list1 = nums.map { it * it }
    println(nums)
    println(list1)
    // har ek element transform ho gya

    val paiduserlist = userlist.map {
        PaidUser(it.id,it.name,"Paid")
    }
    // har ek user ko paid user bana diya hai
    println(paiduserlist)

    // FOR EACH -- loops each element of list one by one
    nums.forEach{ println(it) }
    // single parameters wale functions mein 'it' ka use kr lete hain

}

data class User(val id :Int,val name: String)
data class PaidUser(val id:Int , val name: String , val type:String)