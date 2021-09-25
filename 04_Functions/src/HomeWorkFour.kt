fun main() {
    var sourceString = """F2p)v"y233{0->c}ttelciFc"""

    var m: Int = sourceString.length / 2

    var sourceString1 = sourceString.substring(0, m)
    var sourceString2 = sourceString.substring(m)

    println(replaceString1(sourceString1) + replaceString2(sourceString2))

}

fun replaceString1(str: String): String {
    val shiftedString = str.map { char -> char+1}.joinToString("")
    val replaceString1 = shiftedString.replace('4', 'u')
    val shiftedString2 = replaceString1.map { char -> char - 3 }.joinToString("")
    val replaceFirstString = shiftedString2.replace('0', 'o')
    return replaceFirstString

}

fun replaceString2(str: String): String {
    val reversString = str.reversed()
    val shiftedString = reversString.map { char -> char - 4 }.joinToString("")
    val replaceSecondString = shiftedString.replace('_', ' ')
    return replaceSecondString

}





