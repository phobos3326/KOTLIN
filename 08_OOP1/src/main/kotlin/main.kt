import java.math.BigDecimal
import java.math.BigInteger

fun main() {

    val park = NatureReserve().animals

    repeat(20) {
        lifeCycle(park)
        println("_________________")
    }

    //  println(park.forEach { animal -> animal.info() })
    println(park.size)

    //println(size().toString())


}


fun lifeCycle(zoo: MutableList<Animal>) {
//zoo.forEach { animal -> animal.tryCopy().let { zoo.add(it) } }
    val tempArray = mutableListOf<Animal>()
    val tempArrayOut = mutableListOf<Animal>()
    /* zoo.forEach { animal ->
         //animal.tryCopy()?.let { zoo.add(it) }
         val a = animal.animalCopy()
         tempArray.add(a)
         println("${animal.eat()} " +
                 "${animal.sleep()} " +
                 "${animal.currentAge}" +
                 "${animal.move()}" +
                 "${animal.info()}" +
                 "${tempArray.forEach { animal -> println(animal.info()) }}"
         )


     }*/

    zoo.forEach { animal ->
        //animal.tryCopy()?.let { zoo.add(it) }
        val a = animal.animalCopy()

        // val b = animal.isToOld
        tempArray.add(a)
        // tempArrayOut.add(b)
        animal.eat()
        animal.sleep()
        animal.currentAge
        animal.move()
        if (animal.isToOld) {
            tempArrayOut.add(animal)
        }

        //animal.info()
        //tempArray


    }

    for (i in 1..zoo.size) {
        zoo.add(tempArray[i - 1])
    }

  /*val elseList  = zoo - tempArrayOut
    println( "${elseList.size} tkc kbcn")*/
    zoo.removeAll(tempArrayOut)

}


/*fun size(): BigInteger {

    //fun Long.toBigInteger() = BigInteger.valueOf(this)
    fun Int.toBigInteger() = BigInteger.valueOf(toLong())

    var a = BigInteger("11")
    val b = BigInteger("2")

    repeat(100) {
        a *= b
        println(a)
    }

    return a
}*/
