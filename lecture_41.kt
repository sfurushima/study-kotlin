fun main() {

    /*
    * ・コンパニオンオブジェクト
    * */

    val e1 = Enemy("敵1", 100, 10)
    Enemy.showCreatedEnemyCount()

    val e2 = Enemy("敵2", 100, 10)
    Enemy.showCreatedEnemyCount()

    val e3 = Enemy("敵3", 100, 10)
    Enemy.showCreatedEnemyCount()


}

class Enemy: Character {

    var def: Int

    constructor(name: String, hp: Int, def: Int): super(name, hp) {
        this.def = def
        count += 1
    }

    // 共通・共有の変数・メソッド　(static)
    companion object {
        private var count: Int = 0
        fun showCreatedEnemyCount() {
            println("敵総数:$count")
        }
    }

    override fun showStatus() {
        super.showStatus()
        println("防御力:$def")
    }

    fun showDef() {
        println("防御力:$def")
    }

    open fun defence() {
        println("攻撃を軽減した！")
    }

}

open class Character(val name: String, var hp: Int) {

    open fun showStatus() {
        println("名前:$name")
        println("HP:$hp")
    }
}
