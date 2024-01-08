fun main() {

    /*
    * ・セカンダリコンストラクタ：複数定義可能
    *   >> プライマリコンストラクタも定義されている場合は、
    * 　　　最終的にプライマリコンストラクタを呼び出す
    * ・this：他のコンストラクタを呼び出す
    * */

    println("①")
    val playerA = Character("プレイヤーA", 100)
    playerA.showStatus()

    println("②")
    val playerB = Character("プレイヤーB")
    playerB.showStatus()

    println("③")
    val playerC = Character(500)
    playerC.showStatus()

    println("④")
    val playerD = Character()
    playerD.showStatus()
}

// ① name と hp が両方渡された場合
class Character(var name: String, var hp: Int) {

    // ② hp が渡されなかった場合 50 をプライマリコンストラクタへ渡す
    constructor(name: String): this(name, 50) {
        // セカンダリコンストラクタはコードを書くことができる
        println("** セカンダリ")
    }

    // ③ name が渡されなかった場合 プレイヤーC をプライマリコンストラクタへ渡す
    constructor(hp: Int): this("プレイヤーC", hp)

    // ④ name と hp が渡されなかった場合 プレイヤーD と 10 をプライマリコンストラクタへ渡す
    constructor(): this("プレイヤーD", 10)

    fun showStatus() {
        println("名前:$name")
        println("HP:$hp")
    }
}