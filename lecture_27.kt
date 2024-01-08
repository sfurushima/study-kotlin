fun main() {

    /*
    * ・オブジェクト指向
    * ・プロパティとメソッドをまとめて管理する
    * */

    // () で呼び出す
    // インスタンス化（オブジェクト生成）
    val player = Character()
    player.showStatus()

    // 変更
    player.name = "主人公"
    player.showStatus()
}

// クラス（雛形のようなもの）
class Character {

    // プロパティ（オブジェクトが持つ情報）
    var name: String = "プレイヤー"
    var hp: Int = 100

    // メソッド（オブジェクトの動作・振る舞い）
    fun showStatus() {
        println("名前:$name")
        println("HP:$hp")
    }
}

class Car {

    var name: String = "XX sport"
    var type: String = "セダン"
    var maxSpeed: Int = 180
    var price: Int = 4000000
}

class Person {

    var name: String = "タナカタロウ"
    var age: Int = 20
    var address: String = "~~"
    var tel: String = "090XXXXXXXX"
    var bloodType: String = "A"
}