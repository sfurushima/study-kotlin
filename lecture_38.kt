fun main() {

    /*
    * ・キャスト（型変換）
    * ・アップキャスト：サブ -> スーパ
    * ・ダウンキャスト：スーパ -> サブ
    * */

    val player: Player = Player("プレイヤー", 100, 10, 20)
    // アップキャスト
    val ch: Character = player
    // サブクラスのメソッドが実行される
    ch.showStatus()
    // サブクラスのメソッドは使用できない
    // ch.attack()

    // スマートキャスト
    if(ch is Player) {
        ch.attack()
        // val p: Player = ch
    }
    // ダウンキャスト
    val p: Player = ch as Player
    p.attack()

    println("====================")

    // スーパクラスで作成したオブジェクトをサブクラス型に代入する
    val c = Character("キャラクター", 100)
    // 以下は実行できない
    // val pp: Player = c as Player
    // pp.showStatus()

    if(c is Player)
        println("!!!")


}

class Player(name: String, hp: Int, var atk: Int, override var heal: Int)
    : Character(name, hp), Heal {

    override fun showStatus() {
        super.showStatus()
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
    var heal: Int
    fun healing()
}

open class Character(val name: String, var hp: Int) {
    open fun showStatus() {
        println("名前:$name")
        println("HP:$hp")
    }
}

