fun main() {

    /*
    * ・デフォルト引数：引数を渡さなかった場合に自動的に使用される値
    * ・名前付き引数　：関数呼び出し時に変数名を指定して呼び出す
    * */

    println("-- ① --")

    // height=10, width=20
    println(calcSquareArea(10, 20))

    // height=5, width=5
    println(calcSquareArea())

    // height=3, width=3
    println(calcSquareArea(3))

    // height=5, width=4
    println(calcSquareArea(width = 4))

    
    println("-- ② --")

    // height=5, width=10
    println(calcTriangleArea(5, 10))

    // height=10, width=10
    println(calcTriangleArea(width = 10))

    // 名前無しで引数を渡す場合、記述順で渡す
    // width に値が設定されないためエラー
    // println(calcTriangleArea(2))

}

fun calcSquareArea(height: Int = 5, width: Int = height) = height * width

fun calcTriangleArea(height: Int = 10, width: Int) = height * width / 2