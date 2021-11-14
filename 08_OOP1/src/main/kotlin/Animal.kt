import kotlin.random.Random

open class Animal(var power: Int, var weight: Int, val maxAge: Int, val name: String) {


    var currentAge: Int = 0

    var isToOld: Boolean = false

    /*init {
        isTooOld()
        sleep()
        eat()
        this.move()
    }*/

    /*  fun isTooOld(): Boolean {
          when {
              currentAge >= maxAge -> {
                  return true
              }
          }
          return false
      }*/

    fun ageChange() {
        if (Random.nextBoolean()) {
            currentAge += 1
        }
    }

    fun sleep() {
        ageChange()
        power += 5
        println("$name - спит")

    }

    fun eat() {
        ageChange()
        power += 3
        weight += 1

        println("$name - ест")

    }

    open fun move() {
        ageChange()
        power -= 5
        weight -= 1

        println("$name - передвигается")

    }


    open fun info() {
        println("Имя: $name, энергия: $power, возраст: $currentAge, вес: $weight")
        println("_______________")
    }
    val pow = (1..10).random()
    val wgt = (1..5).random()

    open fun animalCopy(): Animal {
        // var a = NatureReserve().animals

        return Animal(power = pow, weight = wgt, maxAge = 30, name = "Animal РОДИЛСЯ")

    }


    override fun toString() = "Имя: $name, энергия: $power, возраст: $currentAge, вес: $weight"

    open fun tryCopy() {
        val b = animalCopy()
        val a = NatureReserve().animals
        a.add(b)
    }


}


