fun main() {
    val above70 = false
    val knowsprogramming = true


//    AND &&
    var calledforinterview = above70 && knowsprogramming
    println(calledforinterview)

    calledforinterview = above70 || knowsprogramming
    println(calledforinterview)

//    Short-Circuiting
//    agar ek conditions se bhi result aa jaayega toh aage evaluation nahin krte hain

    var i = 10
    var j = 11

//    var result = i == 10 || j++ == 11
    var result = j++ == 11 || i == 10

    println(i)
    println(j)

//    NOT !
    val ans = false
    var res = !ans
    println(res)
    println(!res)
    println(!!res)

}