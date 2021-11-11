import kotlin.random.Random

open class Animal(var power: Int, var weight: Int, val maxAge: Int, val name: String) {


    var currentAge: Int = 0


    /*init {
        isTooOld()
        sleep()
        eat()
        this.move()
    }*/

    fun isTooOld(): Boolean {
        when {
            currentAge >= maxAge -> {
                return true
            }
        }
        return false
    }

    fun sleep() {
        if (Random.nextBoolean()){
            currentAge += 1
            power += 5
            println("$name - спит")

        }


    }

    fun eat() {
        if (Random.nextBoolean()){
            power += 3
            weight += 1
            val a = (0..1).random()
            currentAge += a
            println("$name - ест")
        }


    }

    open fun move() {
        if (Random.nextBoolean()){
            power -= 5
            weight -= 1
            val a = (0..1).random()
            currentAge += a
            println("$name - передвигается")
        }



    }


    open fun info() {
        println("Имя: $name, энергия: $power, возраст: $currentAge, вес: $weight")
        println("_______________")
    }


    open fun animalCopy(): Animal {
        // var a = NatureReserve().animals

        return Animal(power = 10, weight = 10, maxAge = 30, name = "Animal-1")

    }



    override fun toString() = "Имя: $name, энергия: $power, возраст: $currentAge, вес: $weight"

   /* open fun tryCopy() {
        var b = animalCopy()
         var a = NatureReserve().animals
         a.add(b)
     }*/


}