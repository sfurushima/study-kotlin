fun main() {

    /*
    * ・コレクション：複数の値（要素）をまとめて扱う
    * ・可変長（配列は固定長）
    * ・マップ：キーと要素をセットで管理する・キーの重複は許可しない
    * */

    // 読み取り専用
    val map: Map<Int, String> = mapOf(
        1 to "1st",
        2 to "2nd",
        3 to "3rd"
    )

    println("map[1] = ${map[1]}")
    println("map = $map")

    // 変更可能
    val mutableMap: MutableMap<String, String> = mutableMapOf(
        "orange" to "オレンジ",
        "melon"  to "メロン",
        "apple"  to "りんご"
    )

    println("mutableMap[\"orange\"] = ${mutableMap["orange"]}")
    println("mutableMap = $mutableMap")

    // 追加
    mutableMap["banana"] = "バナナ"
    println("mutableMap = $mutableMap")

    // 変更
    mutableMap["orange"] = "みかん"
    println("mutableMap = $mutableMap")

    // 削除
    mutableMap.remove("apple")
    println("mutableMap = $mutableMap")

}