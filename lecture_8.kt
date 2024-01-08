fun main() {

    /*
    * ・null 安全性　（ Null Safety ）
    * ・null 許容型　（ Nullable ）
    * ・null 非許容型（ Non-null ）
    * */

    // デフォルトは null 非許容
    // val str: String = null

    // null 許容型
    val str1: String? = null
    // [ ? 演算子 ] セーフコール演算子
    println("str1 = ${str1?.length}")

    // null かもしれない
    val x: String? = null
    // [ :? ] エルビス演算子
    val str2: String? = x ?:""
    println("str2 = ${str2?.length}")

    // 空のリスト
    val list: MutableList<Int> = mutableListOf(10)
    val num: Int? = list.min() // Int ではなく Int?
    // println(num * 2)  Int? 型の算術演算はできない

    // スマートキャスト
    if(num != null) {
        // この if ブロック内では Int として扱われる
        println(num * 2)
    }

    // [ !! 演算子] 強制的に null 許容型から null 非許容型へ変換する
    val num2: Int = list.min()!! // NullPointerException 注意
    println(num2 * 2)

    val y: Int? = 10
    // val z: Int = y
    val z: Int = y!!

}