fun main() {

    /*
    * ・型変換メソッド（toXX）
    * ・メソッド：クラスが持っている関数（プログラムをまとめたもの）
    * */

    // 以下のような代入はできない
    // val x: Int = 10
    // val y: Long = x

    val int: Int = 100
    println("int = ${int::class}")

    val long: Long = int.toLong()
    println("long = ${long::class}")

    val double: Double = int.toDouble()
    println("double = ${double::class}")

    val str: String = int.toString()
    println("str = ${str::class}")


    // 文字列から数値へ
    val strA = "100"
    val numA = strA.toInt() // OK
    println(numA::class)

    val strB = "ABC"
    // val numB = strB.toInt()  変換後のデータ型に代入できない値はエラーとなる

}