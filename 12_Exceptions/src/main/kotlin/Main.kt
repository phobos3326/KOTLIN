import java.io.*


fun main() {

    val wheel =Wheel()
    println(wheel)
    wheel.checkCurrentPressure()
    wheel.inflateWheel()


}

/*
fun main() {
    val name = "ждьждь  длтдщт"
    try {
        validateName(name)
    } catch (e: NameNotValidException) {
        println(e.message)
    } catch (e: Exception) {
        println(e.message)
    }
}

fun validateName(name: String) {
    if (name.matches(Regex(".*\\d+.*"))) {
        throw NameNotValidException("Your name '$name' contains numeric letters.")
    }
}

class NameNotValidException(message: String) : Exception(message)*/
