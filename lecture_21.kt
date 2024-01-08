fun main() {

    /*
    * ・可変長引数　：引数の個数を可変長にする
    * */

    println("-- ① --")
    println(union(1, 2, 3))

    println("-- ② --")
    val intArray = intArrayOf(1, 2, 3, 4, 5)
    // スプレッド演算子
    println(union(*intArray))

}

//　可変長引数は配列として受け取る
fun union(vararg array: Int): String {

    var str = ""

    for(num in array)
        str += num

    return str
}