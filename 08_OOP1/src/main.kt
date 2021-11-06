import animals.Dog

fun main() {
    //val animal = Dog(power = 10, weight = 10, maxAge = 50, name = "igor")

    val park = NatureReserve().animals

    /*println(animal)

    animal.isTooOld()

    animal.sleep()

    println(animal)

    animal.eat()
    println(animal)

    animal.move()
    println(animal)

    println(animal.isTooOld())*/

    repeat(2) {
        lifeCycle(park)
        println("_________________")
    }


}


fun lifeCycle(zoo: MutableList<Animal>) {

    zoo.forEachIndexed { _, animal ->
        println("${animal.eat()} " +
                "${animal.sleep()} " +
                "${animal.currentAge}" +
                "${animal.move()}"+
                "${animal.animalCopy()}, ${animal.info()}")


    }


}