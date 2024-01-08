fun main() {

    /*
    * ・戻り値を複数返す
    * ・Triple：3つ
    * */

    println("-- ① --")
    val (sum, max, min) = funSumMaxMin(20, 10, 50, 30, 40)
    println("sum = $sum")
    println("max = $max")
    println("min = $min")

    println("-- ② --")
    val triple = funSumMaxMin(20, 10, 50, 30, 40)
    println("first = ${triple.first}")
    println("second = ${triple.second}")
    println("third = ${triple.third}")
}

// Triple<データ型, データ型, データ型>
fun funSumMaxMin(vararg array: Int): Triple<Int, Int, Int> {

    var sum = 0
    var max = 0
    var min = 10

    for(num in array) {
        sum += num
        if(max < num)
            max = num
        if(min > num)
            min = num
    }

    // Triple(値, 値, 値)
    return Triple(sum, max, min)
}