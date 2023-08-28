// data classes ke alag se setter and getter banane padte the..
// kyunki sabke pass data classes ka access nahin hona chahie

// we can use "data" keyword as prefix of classes

// DATA CLASS mein ek priamry constructor hona jaruri hai


fun main()
{
    val p1 = Person1(1,"John")
    val p2 = Person1(1,"John")

    println(p1)   // toString
    println(p2)
    println(p1.hashCode())
    println(p1 == p2)   // p1.equals(p2)

    // agar Person1 data class na hoti toh p1 aur p2 ko alag alag treat kiya jaata
    // kyunki address changed hoga.. bhale hi data same ho dono objects ka

    // DATA class humein object ki copy banane ki bhi functionality provide krti hai

    val p3 = p1.copy()
    println(p3)
    // baaki cheejein copy ho jaayein bas id ki value change ho jaaye
    val p4 = p1.copy(id=5)
    println(p4)

    // DESTRUCTURING
    val (id,name) = p1
    // id = p1.id
    // name = p1.name
    println(id)
    println(name)
    // using COMPONENT

    println(p1.component1())  //p1.id
    println(p1.component2())  // p1.name






}

data class Person1(val id: Int,val name:String)
{

}

