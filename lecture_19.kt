fun main() {

    /*
    * ・ループ制御
    * ・break    ：脱出
    * ・continue ：スキップ
    * ・ラベル
    * */

    println("①")
    for(i in 0 until 10) {
        if(i == 5) // i が 5 のとき、ループを抜ける
            break
        println("$i")
    }

    println("②")
    for(i in 0 until 10) {
        if(i % 2 == 0) // i が偶数のとき、以降のプログラムをスキップする
            continue
        println("$i")
    }

    println("③")
    for(i in 0 until 10) {
        for(j in 0 until 10) {
            if(j == 5) // ループが入れ子の場合は、内側のループを抜ける
                break
            print("$j ")
        }
        println()
    }

    println("④")
    // ラベル設定
    outer@ for(i in 0 until 10) {
        for(j in 0 until 10) {
            if(j == 5)
                break@outer // break 時にラベルの範囲を抜ける
            print("$j ")
        }
        println()
    }

}
