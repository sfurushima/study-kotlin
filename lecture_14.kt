fun main() {

    /*
    * ・if 条件分岐
    * */

    if(true) {
        // true の場合
        println(true)
    } else {
        // false の場合
        println(false)
    }

    // 処理が 1 行の場合は {} は省略可
    if(false)
        println(true)
    else
        println(false)


    val num = 120

    // else if で複数の条件を判定する
    // 条件は上から順に判定される
    if(num > 100)
        println("num > 100")
    else if(num > 50)
        println("num > 50")
    else
        println("その他")

    // 間違い
    if(num > 50)
        println("num > 50")
    else if(num > 100)
        println("num > 100")
    else
        println("その他")

    // 値を返すこともできる
    // その場合、else は必須（必ず返却するため）
    val str = if(num < 100)
        "OK"
    else // 必須
        "NG"

    println(str)

}
