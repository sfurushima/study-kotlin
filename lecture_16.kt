fun main() {

    /*
    * ・ループ（繰り替し）
    * ・while    ：前判定
    * ・do-while ：後判定
    * */

    var i = 0
    // ① 条件判定
    while(i < 10) {
        // ② プログラム実行
        println("i = $i")
        i++
    }

    var j = 0
    do {
        // ① プログラム実行
        println("j = $j")
        j++
    } while(j < 10) // ② 条件判定

}
