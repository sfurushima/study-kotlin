fun main() {

    /*
    * ・コンストラクタの既定値
    * */

    println("-- ① --")
    val p1 = Character()
    p1.showStatus()

    println("-- ② --")
    val p2 = Character("主人公")
    p2.showStatus()

    println("-- ③ --")
    val p3 = Character(hp = 500)
    p3.showStatus()

}

class Character(val name: String = "プレイヤー", val hp: Int = 10) {

    fun showStatus() {
        println("名前:$name")
        println("HP:$hp")
    }
}