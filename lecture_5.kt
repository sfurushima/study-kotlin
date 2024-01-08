fun main() {

    /*
    * ・変数 (var)　　：変更可能
    * ・定数 (val)　　：変更不可
    * ・型推論      　：代入する値でデータ型を判断する
    * ・データ型      ：「数値」「文字列」など、値の種類
    * */

    // 変数：値を保存する箱
    var num = 10
    // $変数名 変数を埋め込むことができる
    println("num = $num")
    // 変数名::class データ型を調べることができる
    println("num = ${num::class}")

    var str = "Hello"
    println("str = $str")
    println("str = ${str::class}")

    // 変数は値の変更が可能
    var x = 100
    println("x = $x")
    x = 200
    println("x = $x")

    // 異なるデータ型の値は代入できない
    // x = "hello"

    // 定数
    val y = 4
    // y = 5  error

}