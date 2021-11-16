import java.math.BigDecimal
import java.math.BigInteger

fun main() {

    val park = NatureReserve().animals

      repeat(10) {
          lifeCycle(park)
          println("_________________")
      }

    //  println(park.forEach { animal -> animal.info() })
      println(park.size)

   // println(size().toString())

}


fun lifeCycle(zoo: MutableList<Animal>) {
//zoo.forEach { animal -> animal.tryCopy().let { zoo.add(it) } }
    val tempArray = mutableListOf<Animal>()
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
        tempArray.add(a)
        animal.eat()
        animal.sleep()
        animal.currentAge
        animal.move()
        //animal.info()
        //tempArray


    }

    for (i in 1..zoo.size) {
        zoo.add(tempArray[i - 1])
    }

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
