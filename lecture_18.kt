fun main() {

    /*
    * ・for
    * ・配列, リスト, マップ
    * */

    // 配列
    val array = arrayOf("りんご", "みかん", "ぶどう")

    println("①")
    // 順番に要素を取得する
    for(fruits in array)
        println(fruits)


    // リスト
    val list = listOf<String>("東京", "大阪", "京都")

    println("②")
    // 順番に要素を取得する
    for(place in list)
        println(place)

    println("③")
    // インデックスと要素を同時に取得する
    for((index, place) in list.withIndex())
        println("$index = $place")

    println("④")
    // インデックスのみ取得する
    for(index in list.indices)
        println("$index")


    // マップ
    val map = mapOf<Int, String>(1 to "one", 2 to "two", 3 to "three")

    println("⑤")
    // key=value の形式
    for(eng in map)
        println(eng)

    println("⑥")
    // キーと要素を同時に取得する
    for((key, value) in map)
        println("$key , $value")

}
