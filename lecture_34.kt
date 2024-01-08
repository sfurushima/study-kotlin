fun main() {

    /*
    * ・オーバライド：スーパクラスのメソッドをサブクラスで上書きする
    * ・opne 修飾子：オーバライドを許可する
    * */

    val player = Player("プレイヤー", 100, 10)
    player.showStatus()
}

class Player(name: String, hp: Int, var atk: Int): Character(name, hp) {

    // override 付けないと実装できない
    override fun showStatus() {
        super.showStatus()
        println("攻撃力:$atk")
    }

    fun attack() {
        println("${name}の攻撃！${atk}のダメージ！")
    }
}

open class Character(val name: String, val hp: Int) {

    // open:オーバライドを許可する
    open fun showStatus() {
        println("名前:$name")
        println("HP:$hp")
    }
}
