fun main() {

    /*
    * ・abstract：オーバライドを強制させる
    *    >> 抽象クラス, 抽象メソッド
    * ・ポリモーフィズム, 多態性
    * */

    // abstract class からオブジェクト生成はできない
    // val ch = Character("Character", 100)

    // Character 型でも宣言可能
    val player = Player("プレイヤー", 100, 20)
    val enemy = Enemy("エネミー", 200, 10)

    val list: List<Character> = listOf(player, enemy)
    // val listP: List<Player> = listOf(player)
    // val listE: List<Enemy> = listOf(enemy)

    for(obj in list) {

        println("===== ${obj.name}ステータス =====")

        // ポリモーフィズム
        obj.showStatus()
    }
}

class Player(name: String, hp: Int, var atk: Int): Character(name, hp) {

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
}

class Enemy(name: String, hp: Int, var def: Int): Character(name, hp) {

    override fun showStatus() {
        println("名前:$name")
        println("HP:$hp")
        println("防御力:$def")
    }

    fun showDef() {
        println("防御力:$def")
    }

    fun defence() {
        println("攻撃を軽減した！")
    }

}

abstract class Character(val name: String, var hp: Int) {
    abstract fun showStatus()
    // コードブロックは必要ない
}

