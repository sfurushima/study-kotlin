fun main() {

    /*
    * ・コレクション：複数の値（要素）をまとめて扱う
    * ・可変長（配列は固定長）
    * ・リスト：順番の概念を持つ
    * */

    // 読み取り専用
    val list: List<Int> = listOf(10, 20, 30)
    // list[0] = 100

    // 変更可能リスト
    val mutableList: MutableList<Int> = mutableListOf(10, 20, 30)
    println("mutableList[0] = ${mutableList[0]}")

    // 変更
    mutableList[0] = 100
    println("mutableList[0] = ${mutableList[0]}")

    // 全体表示
    println("mutableList = $mutableList")

    // 追加
    mutableList.add(50)
    // インデックスを指定して追加
    mutableList.add(1, 500)
    mutableList.add(0, 200)
    println("mutableList = $mutableList")

    // インデックス指定削除
    mutableList.removeAt(0)
    // 要素指定削除
    mutableList.remove(20)
    println("mutableList = $mutableList")

    // シャッフル
    mutableList.shuffle()
    println("mutableList = $mutableList")

}
