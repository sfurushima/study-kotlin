fun main() {

    /*
    * ・型推論
    * ・データ型の種類
    * ・データ型を指定する
    * */

    // 型推論：代入する値で自動的にデータ型を識別する
    val x = 10
    val y = 1.0
    val z = "hello"
    println("x = ${x::class}")  // 整数　　 Int
    println("y = ${y::class}")  // 小数　　 Double
    println("z = ${z::class}")  // 文字列は String

    // 数値（整数） 4種
    val num1: Int = 10          // 32 bit
    val num2: Long = 10L        // 64 bit
    val num3: Short = 32767     // 16 bit
    val num4: Byte = 127        //  8 bit

    // 数値（浮動小数点）2種
    val num5: Double = 1.0      // 64 bit
    val num6: Float = 1.0f      // 32 bit

    // 符号なし
    val num7: ULong
    val num8: UInt
    val num9: UShort
    val num10: UByte

    // 進数 _区切り可能
    val hex = 0xF0
    println("hex = $hex")
    val bin = 0b1111_0000
    println("bin = $bin")

    // 文字列
    val str: String = "hello"
    println("str = $str")

    val text = """
         |ABC
         |           DEF
         |    GHI
    """.trimMargin()
    println(text)

    // 文字
    val c: Char = 'a'

    // 真偽
    val bool1: Boolean = true
    val bool2: Boolean = false

    println("10 > 0 = ${10 > 0}")
    println("10 < 0 = ${10 < 0}")

    // Any 型
    var any: Any = 10
    any = 10.0
    any = "Hello"
}
