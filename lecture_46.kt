fun main() {

    /*
    * ・ジェネリックス型：インスタンス化を行うときにデータ型を渡す
    * */

    val str: Generics<String> = Generics<String>("abc")
    str.display()
    // 型推論
    // val str = Generics<String>("abc")
    // val str = Generics("abc")

    val int = Generics(100)
    int.display()

    str.value = "XXX"
    // str.value = 123 // NG

    // 型の制限
    val c = CharacterGenerics(Character("aa", 10))
    val e = CharacterGenerics(Enemy("aa", 10, 10))
    // val num = CharacterGenerics<Int>(10) // NG

}

// データ型に依存しない汎用的なメソッドが理想
// <T> <E> が一般的
// T: Type  E: Element
class Generics<T>(var value: T) {
    fun display() {
        println(value)
    }
}

// T: Character
//  >> Character クラス or Character を継承したクラスのみ指定可能
class CharacterGenerics<T: Character>(var obj: T) {
    fun display() {
        obj.showStatus()
    }
}


class Enemy(name: String, hp: Int, var def: Int): Character(name, hp) {

    override fun showStatus() {
        super.showStatus()
        println("防御力:$def")
    }

    fun showDef() {
        println("防御力:$def")
    }

    fun defence() {
        println("攻撃を軽減した！")
    }

}

open class Character(val name: String, var hp: Int) {

    open fun showStatus() {
        println("名前:$name")
        println("HP:$hp")
    }
}
