// Collections

// ARRAY -->  fixed size - Static
//ex -
var numa = arrayOf(1,2,3)


// LIST --> variable size - Dynamic
// ex -
var numl = listOf(1,2,3)
// 1. MUTABLE LIST --> can be changed

// 2. IMMUTABLE LIST --> can't be changed
     // how it is beneficial -
        // array -- particular element can be modified
        // immutable list -- particular elements can not be modified
                // multi threaded system mein use krte hain iska


fun main() {
    val nums = listOf(1,2,3)
    println(nums.indexOf(2))     // 2 ka index kya hai list mein
    println(nums.contains(4))   // list mein 4 hai ki nahin
    // ye IMMUTABLE LIST hai
//    nums.add
//    nums[2] = 6

    // creating a MUTABLE LIST
    val numml = mutableListOf(1,2,3)
    numml.add(3,4)
    numml[1] = 6
    numml.remove(1)
    println(numml)

    numml.addAll(nums)   // doosre collection ko isme bhi add kr skte hain
    println(numml)


    // MAPS
    //1. MUTABLE MAPS

    println("\n Starting MAPS from below \n")

    val students = mutableMapOf<Int,String>()
    // key - Int and value - Stirng
    students.put(1,"A")
    students.put(2,"B")
    students.put(3,"C")

    println(students.get(2))
    println(students.get(20))   // out of range index

    // using loop for accessing each
    for ((key,value ) in students)
    {
        println("$key = $value")
    }

    // Direct method
    students[8] = "H"
    println(students[8])

    //2. IMMUTABLE MAPS
    // we use "TO" operator to assign values in it
    val map = mapOf<Int,String>(1 to "Hello",2 to "There", 3 to " !")
//    map.put     isme nahin hai kyunki change nahin kr skte
    println(map)


}

// MAPS --> key - value pair
            // keys should be unique
            // jo exist nahin krti uspe NULL aayega

// 1. IMMUATBLE MAP == Set - changes nahin kr skte hain

// 2. MUTABLE MAP == Dictionary - changes kr skte hain

