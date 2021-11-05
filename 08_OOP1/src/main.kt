import animals.Dog

fun main() {
    //val animal = Dog(power = 10, weight = 10, maxAge = 50, name = "igor")

    var park = NatureReserve().animals

    /*println(animal)

    animal.isTooOld()

    animal.sleep()

    println(animal)

    animal.eat()
    println(animal)

    animal.move()
    println(animal)

    println(animal.isTooOld())*/

    repeat(3){
        lifeCycle(park)
        println("_________________")
    }


}


fun lifeCycle(zoo: List<Animal>) {

    zoo.forEachIndexed { _, animal ->
        println("${animal.eat()}, ${animal.info()} " +
                "${animal.sleep()},${animal.info()} " +
                "${animal.currentAge}, ${animal.info()}" +
                "${animal.move()}, ${animal.info()}")


    }


}