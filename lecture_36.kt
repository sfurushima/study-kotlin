fun main() {

    /*
    * ・アクセス修飾子, 可視性修飾子
    * ・internal     : 同一モジュール内からアクセス可能
    * ・public       : すべてのクラスからアクセス可能
    * ・protected    : 現在のクラス及びサブクラスからアクセス可能
    * ・private      : 現在のクラスからアクセス可能
    * */

    val ch = Character("キャラクター", 100)

    // ch.showStatus()

    val player = Player("プレイヤー", 100, 10);

    player.showStatus()

    // player.showAtk()

    player.attack()

    // val atk = player.attack
}
class Player(name: String, hp: Int, private var atk: Int): Character(name, hp) {

    public override fun showStatus() {
        super.showStatus()
        println("攻撃力:$atk")
    }

    private fun showAtk() {
        println("攻撃力:$atk")
    }

    fun attack() {
        println("${name}の攻撃！${atk}のダメージ！")
    }
}

open class Character(val name: String, val hp: Int) {

    protected open fun showStatus() {
        println("名前:$name")
        println("HP:$hp")
    }
}