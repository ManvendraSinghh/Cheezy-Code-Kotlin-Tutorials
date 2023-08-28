// Arrays
// fixed size object which stores multiple values of same type
fun main() {
    var arr = arrayOf("one","two","three")
    var arr1 = arrayOf(1,2,3)

    var arr2 = arrayOf<Int>(5,6,7) // explicitily defining the type of array

    // iterating through array
    for (i in arr)
    {
        println(i)
    }

    // to get elements with index
    for ((i,e) in arr.withIndex()) {
        println("$e in $i index")
    }

    // for random access
    println(arr[0])
    // OR
    println(arr.get(1))

    // to change the value of any particular element
    arr.set(0,"changed at 0")
    println(arr[0])

    // So we have used GET and SET in array

    println(arr.size) // to print the size of an array
    println(arr[4])






}