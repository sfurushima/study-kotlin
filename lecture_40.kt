fun main() {

    /*
    * ・オブジェクト宣言
    * ・シングルトン
    * */

    AppInfo.display()

    // オブジェクト生成はできない（必要ない）
    // val app = AppInfo()

    // 無意味
    val app1 = AppInfo
    val app2 = AppInfo

    println("===========")
    app1.display()
    app2.display()

    println("===========")
    app1.name = "YY GAME"
    app1.display()
    app2.display()

    println("===========")
    AppInfo.display() // ここまで不要
    AppInfo.name = "ZZ RPG"
    AppInfo.display()

}

// コレ自体がインスタンス（オブジェクト）
object AppInfo {

    var name: String = "XX RPG"

    fun display() {
        println(name)
    }
}

// オブジェクト宣言が継承を行い、
// スーパクラスにコンストラクタが存在する場合は、
// 直接値を指定する
// object obj: class("abc") {
