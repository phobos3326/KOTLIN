import animals.Dog
import animals.Fish

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


    zoo.forEach { animal ->
        // animal.animalCopy()?.let { zoo.add(it) }
        //var a = animal.animalCopy()
        // zoo.add(a)
        println("${animal.eat()} " +
                "${animal.sleep()} " +
                "${animal.currentAge}" +
                "${animal.move()}" +
                "${animal.info()}")


    }



   /* zoo.forEach { animal ->
        animal.animalCopy().let { zoo.add(it) }

        *//* try {
        println("зоопарк:")
        var iter: Iterator<Animal> = zoo.iterator()
        while (iter.hasNext()){
            print("""${iter.next()}  """)
        }
        println("""Trying to add an element in between iteration: ${zoo.forEach()}""".trimIndent())
    } catch (e:Exception){
        println(e)
    }*//*

    }*/
}


/*
object modificationError {
    @JvmStatic
    fun main(args: Array<String>) {


        // Creating an object of ArrayList Object
        val arr = ArrayList<String>()
        arr.add("One")
        arr.add("Two")
        arr.add("Three")
        arr.add("Four")
        try {
            // Printing the elements
            println("ArrayList: ")
            var iter: Iterator<String> = arr.iterator()
            while (iter.hasNext()) {
                print(iter.next() + ", ")
            }
            // No exception is raised as
            // a modification is done
            // after the iteration
            println(
                """Trying to add an element in between iteration: ${arr.add("Five")}""".trimIndent())
            // Printing the elements
            println("\nUpdated ArrayList: ")
            iter = arr.iterator()
            while (iter.hasNext()) {
                print(iter.next() + ", ")
            }
        } catch (e: Exception) {
            println(e)
        }
    }
}*/







/*
internal object GFG {
    // Main driver method
    @JvmStatic
    fun main(args: Array<String>) {

        // Creating an collection class object
        // Declaring object of integer type
        val list = ArrayList<Int>()

        // Adding element to ArrayList
        // using add() method

        // Custom integer input entries
        list.add(1)
        list.add(2)
        list.add(3)
        list.add(4)
        list.add(5)

        // Display the value of ArrayList
        println("List Value Before Iteration:"
                + list)

        // Creating an iterator object
        // to iterate over the ArrayList
        val itr = list.iterator()

        // Condition check
        // it holds true till there is single element
        // remaining in the List
        while (itr.hasNext()) {

            // next() method() loos out for next element in
            // the List
            val value = itr.next()

            // Here we are trying to remove the one entry of
            // ArrayList base on the given if condition and
            // hence

            // We will get Concurrent ModificationException
            if (value == 3) itr.remove()
        }
        // Display the value of ArrayList
        println("List Value After iteration:"
                + list)
    }
*/



