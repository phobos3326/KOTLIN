fun main() {
    var sourceString: String = """F2p)v"y233{0->c}ttelciFc"""

    var m: Int = sourceString.length / 2

    var sourceString1 = sourceString.substring(0, m)
    var sourceString2 = sourceString.substring(m)


    println(replaceString1(sourceString1) + replaceString2(sourceString2))

}


fun replaceString1(str: String): String {

    val shiftedString = str.map { char -> char + 1 }.joinToString("")
    //println("сдвиг символов          $shiftedString")

    val replaceString1 = shiftedString.replace('4', 'u')
    //println("сдвиг символов          $replaceString1")

    val shiftedString2 = replaceString1.map { char -> char - 3 }.joinToString("")
    // println("сдвиг символов          $shiftedString2")

    var replaceFirstString = shiftedString2.replace('0', 'o')
    // println("замена символа в строке $replaceFirstString")


    return replaceFirstString

}

fun shift(str: String, shiftedSymbol: Int):String {
    str.map { char -> char - shiftedSymbol }.joinToString("")
    return str
}


fun replaceString2(str: String): String {
    val reversString = str.reversed()
    //println("разворот строки         $reversString")

    val shiftedString = reversString.map { char -> char - 4 }.joinToString("")
    // println("сдвиг символов          $shiftedString")

    var replaceSecondString = shiftedString.replace('_', ' ')
    //println("замена символа в строке $replaceSecondString")


    return replaceSecondString

}





fun convert(x: Double, converter: (Double) -> Double): Double {
    // ваш код
    return x
}



