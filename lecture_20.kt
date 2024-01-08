fun main() {

    /*
    * ・関数　　　：プログラムをまとめたもの
    * ・引数　　　：関数に渡す値
    * ・戻り値　　：関数を実行したら返ってくる値
    * ・単一式関数：関数が単一式で構成される場合 {} が省略できる
    * */

    println("-- ① --")
    // 関数呼び出し
    sayMessage()

    println("-- ② --")
    // 関数を呼び出して戻り値を取得する
    val msg = getMessage()
    println(msg)

    println("-- ③ --")
    // 関数に引数を渡す
    sayString("sayString")

    println("-- ④ --")
    // 関数に引数を渡して戻り値を取得する
    val str = unionString("Hello", "Kotlin")
    println(str)
}

// *** ① ***
fun sayMessage(): Unit { // Unit は省略可
    println("sayMessage")
}

// *** ② ***
// fun getMessage(): String {
//     return "getMessage"
// }

// fun getMessage(): String = "getMessage"

// 単一式関数
fun getMessage() = "getMessage"

// *** ③ ***
fun sayString(str: String) {
    println(str)
}

// *** ④ ***
// 単一式関数
fun unionString(str1: String, str2: String) = str1 + str2