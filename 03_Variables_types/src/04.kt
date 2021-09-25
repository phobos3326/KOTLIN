fun main() {
    var sourceString: String = """F2p)v"y233{0->c}ttelciFc"""

    var m: Int = sourceString.length / 2

    var sourceString1 = sourceString.substring(0, m)
    var sourceString2 = sourceString.substring(m)

    val x: (Char) -> Char = { char -> char + 1 }
    val y: (Char) -> Char = { char -> char - 3 }
    val z: (Char) -> Char = { char -> char - 4 }

    println(replaceString1(sourceString1) + replaceString2(sourceString2))


  /*  val firstList = listOf(1, 4, 10)
    val a = { n: Int, m: Int -> println(n + m) }
    val mult: (Int) -> Int = { it * 2 }
    a(10, 20)
    a(20, 50)
    val multList = mathWithList(firstList, mult)

    println(multList)*/

}


fun shift(stroka:String, shifting: (Char) -> Char):String{

    val shiftedString = stroka.map (shifting).joinToString("")
    return  shiftedString
}

/*
fun mathWithList(yourList: List<Int>, math: (Int) -> Int): List<Int> {
    val newList = mutableListOf<Int>()
    for (i in yourList) {
        newList.add(math(i))
    }
    return newList
}
*/

/*fun shift(str: String, sifting: (Char) -> Char): String {

    //val shiftedString = str.map { char -> char + 1 }.joinToString("")
    return shiftedString
}*/

fun replaceString1(str: String): String {

    //val shiftedString = str.map { char -> char + 1 }.joinToString("")
    val shiftedString = str.map { char -> char+1}.joinToString("")
    //println("сдвиг символов          $shiftedString")

    val replaceString1 = shiftedString.replace('4', 'u')
    //println("сдвиг символов          $replaceString1")

    val shiftedString2 = replaceString1.map { char -> char - 3 }.joinToString("")
    // println("сдвиг символов          $shiftedString2")

    var replaceFirstString = shiftedString2.replace('0', 'o')
    // println("замена символа в строке $replaceFirstString")


    return replaceFirstString

}

fun replaceString2(str: String): String {


    val reversString = str.reversed()
    //println("разворот строки         $reversString")

    // val shiftedString = reversString.map { char -> char - 4 }.joinToString("")
    val shiftedString = reversString.map { char -> char - 4 }.joinToString("")
    // println("сдвиг символов          $shiftedString")

    var replaceSecondString = shiftedString.replace('_', ' ')
    //println("замена символа в строке $replaceSecondString")


    return replaceSecondString

}





