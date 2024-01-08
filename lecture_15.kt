fun main() {

    /*
    * ・when 多岐分岐
    * */

    val num = 5

    // 条件式は単一の値や、カンマ区切り、範囲指定などが指定できる
    // -> で処理を記入する
    when(num) {
        5 -> println("num = 5")
        6, 7 -> println("num = 6 or 7")
        in 11..20 -> println("num = 11-20")
        else -> {
            // 処理が複数行の場合は {} で囲う
            println("当てはまりません")
            println("その他の値です")
        }
    }

    // 値を返すこともできる
    // その場合、else は必須（必ず返却するため）
    val str = when(num) {
        5 -> "num = 5"
        6, 7 -> "num = 6 or 7"
        in 11..20 -> "num = 11-20"
        else -> "その他の値です"
    }
    println(str)

    // is 演算子を使うことでデータ型の判定が行える
    val type :Any = 10
    when(type) {
        is Int -> println("Int")
        is Double -> println("Double")
        is String -> println("String")
    }

}
