//import model.Character
//import model.*
import model.Character as ch

fun main() {

    /*
    * ・パッケージ
    * ・インポート
    * ・エイリアス（別名）
    * */

    // インポート文を書かずにクラスを呼び出す
    // val player = model.Character()

    // インポートしたクラスを呼びだす
    // val player = Character()

    // インポートしたクラスにエイリアスを設定した場合
    val player = ch()
    player.showStatus()

}

// package model
class Character(val name: String, val hp: Int) {

    var name: String = "プレイヤー"
    var hp: Int = 100

    fun showStatus() {
        println("名前:$name")
        println("HP:$hp")
    }
}