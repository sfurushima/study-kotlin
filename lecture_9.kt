fun main() {

    /*
    * ・配列：複数の値（要素）を保存する箱
    * */

    // 配列の宣言と値の設定
    // <>:ジェネリックス・・・データ型を指定することができる
    val array: Array<Int> = arrayOf(10, 20, 30)
    // 0 から始まる添字（インデックス）でアクセスする
    println("array[0] = ${array[0]}")   // 10
    println("array[1] = ${array[1]}")   // 20
    println("array[2] = ${array[2]}")   // 30
    // println("array[3] = ${array[3]}") 存在しない場所へのアクセスはエラー

    // 変更
    array[1] = 100
    array.forEach { print("$it ") }
    println("\n")

    // 文字列
    val strArray: Array<String> = arrayOf("おはよう", "こんにちは", "こんばんは")
    strArray.forEach { print("$it ") }
    println("\n")

    // ジェネリックスを使用しない数値配列
    val intArray = intArrayOf(1, 2)
    intArray.forEach { print("$it ") }
    println("\n")

    // null で初期化（ null 許容型 ）
    val nullArray: Array<String?> = arrayOfNulls<String>(5)
    nullArray.forEach { print("$it ") }

    nullArray[0] = "hello"
    nullArray.forEach { print("$it ") }

}
