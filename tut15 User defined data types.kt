// Some methods are dependent on the values of properties

class human(val name : String,var age:Int){
    fun canvote():Boolean
    {
        return age>18
    }
 // Here you can think "human" to be as User Defined Data Type where we can store info about them in the way we want
}

fun main() {
    val person1 = human("A",17)
    val person2 = human("B",20)
    val person3 = human("C",10)


    person1.age = 21 // it is variable

    println(person1.canvote())
    println(person2.canvote())
    println(person3.canvote())

    // Objects ki jo properties ki values hoti hain.. methods uspe kaam krte hain

}