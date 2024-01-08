fun main() {

    /*
    * ・ラムダ式（匿名関数）
    * ・無名関数
    * */

    // ラムダ式
    println(calcB(5, 10) { x: Int, y: Int -> x + y })

    // 無名関数：戻り値の型を指定できる
    println(calcB(5, 10, fun(x: Int, y: Int): Int = x + y))

}

fun calcB(a: Int, b: Int, func: (Int, Int) -> Int) = func(a, b)