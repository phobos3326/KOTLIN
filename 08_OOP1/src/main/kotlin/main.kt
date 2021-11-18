import java.math.BigDecimal
import java.math.BigInteger

fun main() {

    val park = NatureReserve().animals

    repeat(20) {
        lifeCycle(park)
        println("_________________")
    }


    println(park.size)


}


fun lifeCycle(zoo: MutableList<Animal>) {

    val tempArray = mutableListOf<Animal>()
    val tempArrayOut = mutableListOf<Animal>()


    zoo.forEach { animal ->

        val a = animal.animalCopy()

        tempArray.add(a)

        animal.eat()
        animal.sleep()
        animal.currentAge
        animal.move()
        if (animal.isToOld) {
            tempArrayOut.add(animal)
        }


    }

    for (i in 1..zoo.size) {
        zoo.add(tempArray[i - 1])
    }


    zoo.removeAll(tempArrayOut)

}



