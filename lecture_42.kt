fun main() {

    /*
    * ・インナークラス, ネストクラス
    * */

    val outer = Outer(10)
    outer.display()
    println()

    outer.innerCreate(20)
    outer.obj.display()
    println()

    val inner = outer.innerCreateReturn(30)
    inner.display()

}

class Outer(val num: Int) {

    // 遅れて初期化する
    lateinit var obj: Inner

    fun innerCreateReturn(num: Int): Inner {
        // インナークラスを生成して返却する
        return Inner(num)
    }

    fun innerCreate(num: Int) {
        // インナークラスを生成してプロパティに代入する
        obj = Inner(num)
    }

    fun display() {
        println("Outer = $num")
    }

    inner class Inner(val num: Int) {

        fun display() {
            // 外側のクラスのプロパティにアクセスする
            println("@Outer = ${this@Outer.num}")
            println("Inner = $num")
        }
    }
}
