import java.math.BigDecimal
import java.math.BigInteger

fun main() {

    val park = NatureReserve().animals

    repeat(20) {
        lifeCycle(park)
        println("_________________")
    }

    println("в заповеднике осталось ${park.size} животных")

}



fun lifeCycle(zoo: MutableList<Animal>) {

    val tempArray = mutableListOf<Animal>()
    val tempArrayOut = mutableListOf<Animal>()

    zoo.forEach { animal ->

        when ((1..4).random()) {
            1 -> animal.sleep()
            2 -> animal.move()
            3 -> animal.eat()
            4 -> tempArray.add(animal.animalCopy())
        }

        if (animal.isToOld) {
            tempArrayOut.add(animal)
        }
        animal.info()
    }

    zoo.addAll(tempArray)
   // tempArray.clear()
    zoo.removeAll(tempArrayOut)
    //tempArrayOut.clear()


}



