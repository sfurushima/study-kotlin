fun main() {

    /*
    * ・enum 型, 列挙型
    * */

    val day: Week = Week.Sunday
    println(day)

    if(day == Week.Sunday) {
        println(true)
    }
    println()

    when(day) {
        Week.Sunday -> println("sunday")
        Week.Monday -> println("monday")
    }
    println()

    println("day.value = ${day.value}")
    println("day.ordinal = ${day.ordinal}")
    println()

    for(week in Week.values()) {
        println(week)
    }

}

// 値を持つことができる
enum class Week(val value: Char) {
    Sunday('日'),
    Monday('月'),
    Tuesday('火'),
    Wednesday('水'),
    Thursday('木'),
    Friday('金'),
    Saturday('土')
}

//enum class Week {
//    Sunday,
//    Monday,
//    Tuesday,
//    Wednesday,
//    Thursday,
//    Friday,
//    Saturday
//}
