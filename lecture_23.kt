fun main() {

    /*
    * ・戻り値を複数返す
    * ・Pair：2つ
    * */

    println("-- ① --")
    val (sum, max) = funSumMax(20, 10, 50, 30, 40)
    println("sum = $sum")
    println("max = $max")

    // 片方しか受け取らない場合
    val (x, _) = funSumMax(20, 10, 50, 30, 40)

    println("-- ② --")
    // 返却値を指定する
    val pair = funSumMax(20, 10, 50, 30, 40)
    println("first = ${pair.first}")
    println("second = ${pair.second}")
}

// Pair<データ型, データ型>
fun funSumMax(vararg array: Int): Pair<Int, Int> {

    var sum = 0
    var max = 0

    for(num in array) {
        sum += num
        if(max < num)
            max = num
    }

    // Pair(値, 値)
    return Pair(sum, max)
}