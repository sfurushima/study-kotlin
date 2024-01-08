fun main() {

    /*
    * ・継承（インヘリタンス）
    * ・スーパクラス（親クラス, 基底クラス）
    * ・サブクラス（子クラス, 派生クラス）
    * ・open 修飾子：継承を許可する
    * */

    val player = Player("プレイヤー", 100, 10)

    // スーパクラスのメソッドも利用できる
    player.showStatus()

    // サブクラスのメソッド
    player.showAtk()
    player.attack()
}

// プライマリコンストラクタでプロパティ宣言
// :スーパクラス(..) でスーパクラスのコンストラクタを呼びだす
class Player(name: String, hp: Int, var atk: Int): Character(name, hp) {

    fun showAtk() {
        println("攻撃力:$atk")
    }

    fun attack() {
        println("${name}の攻撃！${atk}のダメージ！")
    }
}

/*
class Player: Character {

    var atk: Int

    // :super(..) でスーパクラスのコンストラクタを呼びだす
    constructor(name: String, hp: Int, atk: Int): super(name, hp) {
        this.atk = atk
    }

    fun showAtk() {
        println("攻撃力:$atk")
    }

    fun attack() {
        println("${name}の攻撃！${atk}のダメージ！")
    }
}
*/

// open を付けることで継承可能なクラスとなる
open class Character(val name: String, val hp: Int) {

    fun showStatus() {
        println("名前:$name")
        println("HP:$hp")
    }
}
