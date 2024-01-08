fun main() {

    /*
    * ・アクセッサ（get:ゲッター, set:セッター）
    * 　>> 代入時・取得時に自動的に呼ばれる
    * ・バッキングフィールド ( field )
    * */

    println("-- ① --")
    val player = Character("プレイヤー", 100)
    player.showStatus()

    println("-- ② --")
    player.name = "" // set
    player.showStatus()

    println("-- ③ --")
    player.name = "主人公" // set
    player.showStatus()

    println("-- ④ --")
    println("${player.name} = ${player.length} 文字") // get

    println("-- ⑤ --")
    // オブジェクト生成時にも set が使われている
    val player2 = Character("", 100)
    player2.showStatus()
}

class Character {

    var name: String
        // value として値を受け取る（value でなくても良い）
        set(value) {
            // field ：プロパティ格納用に自動生成される
            field = if(value == "") {
                println("名前が正しくありません。")
                "NO NAME"
            } else {
                value
            }
        }
    var hp: Int
    val length: Int
        /*
        get() {
            return name.length
        }*/
        get() = name.length

    constructor(name: String, hp: Int) {
        this.name = name
        this.hp = hp
    }

    fun showStatus() {
        println("名前:$name")
        println("HP:$hp")
    }
}