fun main() {

    /*
    * ・（プライマリ）コンストラクタ
    * ・プロパティ宣言
    * */

    // クラスに値を渡してオブジェクトを生成する
    val pA = Character("プレイヤーA", 100)
    pA.showStatus()

    val pB = Character("プレイヤーB", 200)
    pB.showStatus() // pA と pB で引数が異なるため、実行結果も異なる
}

// プロパティ宣言
// this.XX = XX のような初期化処理を簡略化する
class Character(var name: String, var hp: Int) {

    fun showStatus() {
        println("名前:$name")
        println("HP:$hp")
    }
}

/*
// constructor は省略可
class Character constructor(name: String, hp: Int) {

    var name: String
    var hp: Int

    // init は以下と同じ
    // var name = name
    // var hp = hp
    init {
        // init：初期化処理・プライマリコンストラクタの引数にアクセスできる
        // プロパティと引数の名前が同じ場合、this をつけるとプロパティが選択される
        this.name = name
        this.hp = hp
    }

    fun showStatus() {
        println("名前:$name")
        println("HP:$hp")
    }
}
*/