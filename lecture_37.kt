fun main() {

    /*
    * ・インタフェース
    * ・多重実装
    * */

    val player = Player("プレイヤー", 100, 10, 20)
    player.showStatus()
    println()

    player.healing()
    println()

    player.showStatus()

}

class Player(name: String, hp: Int, var atk: Int, override var heal: Int)
    : Character(name, hp), Heal {

    override fun showStatus() {
        println("名前:$name")
        println("HP:$hp")
        println("攻撃力:$atk")
    }

    fun showAtk() {
        println("攻撃力:$atk")
    }

    fun attack() {
        println("${name}の攻撃！${atk}のダメージ！")
    }

    override fun healing() {
        hp += heal
        println("HPを${heal}回復しました")
    }
}

interface Heal {

    // 抽象プロパティ, 初期値は持てない
    var heal: Int //

    fun healing()
    // コードブロックを書くこともできる
    // fun healing() {
    //     println("HPを${heal}回復しました")
    // }
}

abstract class Character(val name: String, var hp: Int) {
    abstract fun showStatus()
}
