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

    repeat(1) {
        lifeCycle(park)
        println("_________________")
    }

    println(park.size)

}


fun lifeCycle(zoo: MutableList<Animal>) {
//zoo.forEach { animal -> animal.tryCopy().let { zoo.add(it) } }
    val tempArray = mutableListOf<Animal>()
    zoo.forEach { animal ->
        //animal.tryCopy()?.let { zoo.add(it) }
        val a = animal.animalCopy()
        tempArray.add(a)
        println("${animal.eat()} " +
                "${animal.sleep()} " +
                "${animal.currentAge}" +
                "${animal.move()}" +
                "${animal.info()}"+
                "$tempArray"
        )



    }

    for (i in 1..zoo.size) {
        zoo.add(tempArray[i -1])
    }

}




