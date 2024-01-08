fun main() {

    /*
    * ・高階関数：引数や戻り値に関数を指定する
    * ・ラムダ式（匿名関数）：使い捨ての関数
    * */

    // 以下、① と ② のプログラムは同等

    // ① 高階関数
    val n1 = calcB(5, 10, ::calcA)
    println("n1 = $n1")

    // ② ラムダ式
    // この場で、calcA と同等の関数を一時的に作成して渡している
    // val n2 = calcB(5, 10, { x: Int, y: Int -> x + y })
    //  >> 引数の最後がラムダ式の場合、{} は外に出すことができる
    val n2 = calcB(5, 10) { x: Int, y: Int -> x + y }
    println("n2 = $n2")


    // n3, n4. n5 は同じ
    // 高階関数
    val n3 = funcB(10, ::funcA)
    println("n3 = $n3")

    // ラムダ式
    val n4 = funcB(10) { x: Int -> x + 1 }
    println("n4 = $n4")

    // ラムダ式の引数が単一の場合は it を使用することができる
    val n5 = funcB(10) { it + 1 }
    println("n5 = $n5")

}

// 高階関数用に作成された関数
//  >> 高階関数以外で使用されないケースが多い
fun calcA(a: Int, b: Int) = a + b

// (..) -> (..) の形式で関数を渡している
// (関数が受け取るデータ型, ...) -> 返却値の型
fun calcB(a: Int, b: Int, func: (Int, Int) -> Int) = func(a, b)


fun funcA(a: Int) = a + 1

fun funcB(a: Int, func: (Int) -> Int) = func(a)