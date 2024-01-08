fun main() {

    /*
    * ・オブジェクト式
    * */

    // Enemy を継承したサブクラスを生成している
    val weakEnemy = object: Enemy("モブ", 10, 0) {
        override fun defence() {
            println("防御に失敗した！")
        }
    }

    weakEnemy.defence()

}

open class Enemy(name: String, hp: Int, var def: Int): Character(name, hp) {

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
