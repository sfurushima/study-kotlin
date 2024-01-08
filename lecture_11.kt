fun main() {

    /*
    * ・コレクション：複数の値（要素）をまとめて扱う
    * ・可変長（配列は固定長）
    * ・セット：順番の概念がなく、要素の重複を許可しない
    * */

    // 読み取り専用
    val set: Set<Int> = setOf(1, 2, 3)

    // 変更可能
    val mutableSet: MutableSet<String> = mutableSetOf("A", "B", "C")

    // 全体表示
    println("mutableSet = $mutableSet")

    // 追加
    mutableSet.add("D")
    println("mutableSet = $mutableSet")

    // 重複要素を追加（エラーは発生しないが追加はされない）
    mutableSet.add("C")
    println("mutableSet = $mutableSet")

    // 削除
    mutableSet.remove("B")
    println("mutableSet = $mutableSet")

}
