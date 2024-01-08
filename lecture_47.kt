fun main() {

    /*
    * ・ジェネリックス関数
    * */

    val numList = listOf<Int>(1, 2, 3, 4, 5)
    val x = getMiddle<Int>(numList)
    println(x)

    val doubleList = listOf<Double>(1.2, 2.1, 3.0, 4.5, 5.2)
    val y = getMiddle<Double>(doubleList)
    println(y)

    val strList = listOf<String>("1", "2", "3", "4", "5")
    val z = getMiddle<String>(strList)
    println(z)
}

fun <T> getMiddle(list: List<T>) = list[list.size / 2]

/*
fun <T> getMiddle(list: List<T>): T {
    return list[list.size / 2]
}
*/