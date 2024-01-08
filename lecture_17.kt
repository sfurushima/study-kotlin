fun main() {

    /*
    * ・ループ（繰り替し）
    * ・for
    * */

    // i が 0~10 まで変化：11 回ループ
    println("①")
    for(i in 0..10) // .. 範囲なので 10 も含まれる
        println("i = $i")

    // i が 0~9 まで変化：10 回ループ
    println("②")
    for(i in 0 until 10) // 10 を含まない
        println("i = $i")

    println("③")
    // i が 10~0 まで変化：11 回ループ
    for(i in 10 downTo 0) // 減算していく
        println("i = $i")

    println("④")
    // i が 10~0 まで -2 ずつ変化：6 回ループ
    for(i in 10 downTo 0 step 2) // 加算値を変更する
        println("i = $i")

    println("⑤")
    // 2 重ループで九九の答えを表示させる
    // i=1, j=1,2,3...
    // i=2, j=1,2,3...
    for(i in 1..9) {
        for(j in 1..9)
            print("%3d".format(i*j))
        println()
    }

}
