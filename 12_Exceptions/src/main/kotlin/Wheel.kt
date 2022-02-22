import java.util.Scanner
import kotlin.random.Random
import kotlin.random.nextInt

class Wheel {

  // val eee =Random.nextInt(0..10)

     private var currentPressure: Int = Random.nextInt(0..10)



    /* private fun inputValue(): Int {
       val rnd=  Scanner(System.`in`).nextInt()
         return rnd
     }*/


    fun inflateWheel() {
        val rnd = Scanner(System.`in`).nextInt()
        checkCurrentPressure()

     /*   if (currentPressure < 1) {
            throw TooLowPressure()

        } else {
            currentPressure = rnd

        }*/



    }

    fun checkCurrentPressure() {


        if (currentPressure<1 ||currentPressure>3){
            throw IncorrectPressure()
        }

    }

    override fun toString(): String {
        return "current pressure $currentPressure"
    }
}