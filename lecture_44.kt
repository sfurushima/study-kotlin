fun main() {

    /*
    * ・シールドクラス
    * 　 >> ネストクラス or 同一ファイル内のみ継承可能
    * */

    var status: Status = Status.Enable

    status = Status.Disable

    // enum と異なり、任意の値を後から設定できる
    status = Status.Error("Error: 001")

}

// enum を拡張したようなクラスが作成できる
sealed class Status {
    object Enable: Status()
    object Disable: Status()
    class Error(val str: String) : Status()
}

sealed class SealedClass {
    // ネストクラスなので継承可
    class ClassA: SealedClass()
}

// 同一ファイルなので継承可
class ClassB: SealedClass() {

}