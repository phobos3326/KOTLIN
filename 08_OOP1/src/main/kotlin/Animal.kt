import kotlin.random.Random

open class Animal(var power: Int, var weight: Int, val maxAge: Int, val name: String) {


    var currentAge: Int = 0

    val isToOld: Boolean
        get() = currentAge >= maxAge

    private fun tryIncrementAge() {
        if (Random.nextBoolean()) {
            currentAge += 1
        }
    }

   /* private val isPower: Boolean
        get() = power >= 5

    private fun tryDecrementPower() {
        if (isPower) {
            power -= 5
        }
    }*/

    fun sleep() {
        tryIncrementAge()
        power += 5
        println("$name - спит")

    }

    fun eat() {
        tryIncrementAge()
        power += 3
        weight += 1

        println("$name - ест")

    }

  /*  open fun move() {
        tryIncrementAge()
        tryDecrementPower()
        weight -= 1

        println("$name - передвигается")

    }*/


    open fun move() {
        if(!isToOld && power >= 5 && weight >= 1) {
            tryIncrementAge()
            power -= 5
            weight -= 1

            println("$name - передвигается")

        }
    }


    open fun info() {
        println("Имя: $name, энергия: $power, возраст: $currentAge, вес: $weight")
        println("_______________")
    }

    val pow = (1..10).random()
    val wgt = (1..5).random()

    open fun animalCopy(): Animal {
        println("$name - рожает")
        return Animal(power = pow, weight = wgt, maxAge = 30, name = "Animal РОДИЛСЯ")

    }


    override fun toString() = "Имя: $name, энергия: $power, возраст: $currentAge, вес: $weight"

}


