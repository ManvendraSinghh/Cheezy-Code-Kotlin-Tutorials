// SCOPED functions -- UTILITY Functions
                    // apply , let , with , run

fun main() {
    val emp = Employee()
    emp.age = 20
    emp.name = "John"
    println(emp)

    // using APPLY
    emp.apply {
        age = 30
        name = "Sean"
    }

    println(emp.name)
    println(emp.age)

    // using LET
    // baar baar object ka naam nahin likhna padega
    emp.let {
        println(it.name)
        println(it.age)
    }
    // single parameter lamda function hai ye
    // scope ka data type uske last expression ke data type hi hoga

    // it na use krna pade baar baar toh hum ab aur improve krenge


    // using WITH
    with(emp){
        age = 30
        name = "XYZ"
    }
    println(emp)

    // using RUN
    // combination of WITH and LET
    emp.run {
        age = 35
        name = "PQR"
    }



    println(emp)
}

data class Employee(var name:String = "", var age:Int = 18)
