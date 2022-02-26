import java.util.Scanner
import kotlin.random.Random
import kotlin.random.nextInt

class Wheel {

    private var currentPressure = Random.nextInt(0..10).toFloat()

    fun inflateWheel() {
        checkCurrentPressure()
        while (currentPressure !in 1.5..3.0) {

            println("введите давление на которое хотите изменить текущее")
            val scanner = Scanner(System.`in`).nextFloat()
            val tmpPressure = currentPressure + scanner
            if (tmpPressure < 0 || tmpPressure > 10) {
                checkCurrentPressure()
            } else {
                currentPressure = tmpPressure
                checkCurrentPressure()
            }
        }
    }

    private fun exceptionPressure() {
        if (currentPressure in 0.0..1.0) {
            throw TooLowPressure("низкое давление  $currentPressure")
        } else if (currentPressure > 3 && currentPressure < 10) {
            throw TooHighPressure("высокое давление  $currentPressure")
        } else if (currentPressure <= 0 || currentPressure >= 10) {
            throw IncorrectPressure("неправильное давление  $currentPressure")
        } else if (currentPressure in 1.5..3.0) {
            println("давление $currentPressure номальное")
        }
    }

    private fun checkCurrentPressure() {
        try {
            exceptionPressure()
        } catch (e: IncorrectPressure) {
            println(e.message)
        } catch (e: TooHighPressure) {
            println(e.message)
        } catch (e: TooLowPressure) {
            println(e.message)
        }
    }

    override fun toString(): String {
        return "current pressure $currentPressure"
    }

}