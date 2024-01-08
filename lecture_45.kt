fun main() {

    /*
    * ・データクラス
    * 　 >> データを管理することに特化したクラス
    * 　 >> メソッドを持つことはできない
    * ・toString, equals, copy, componentN
    * */

    val f1 = Fruits("りんご", 100)
    f1.area = "青森"

    val f2 = Fruits("りんご", 100)
    f2.area = "長崎"


    // toString :「クラス名(プロパティ名=値,・・・)」の形式
    println(f1)

    // equals : プライマリコンストラクタで定義したプロパティが等しいか
    println(f1 == f2)

    // copy : 特定のプロパティを変更してオブジェクトを複製する
    val f3 = f1.copy(name = "オレンジ")
    val f4 = f1.copy(price = 500)
    println(f3)
    println(f4)

    // componentN : プロパティの分割代入を行う
    // val name = f1.component1()
    // val price = f1.component2()
    val (name, price) = f1

}

// 基本的にプライマリコンストラクタだけで成立する
// data class Item(val name: String, val price: Int)

data class Fruits(val name: String, val price: Int) {
    var area: String = ""
}