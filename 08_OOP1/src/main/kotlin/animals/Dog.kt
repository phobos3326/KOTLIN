package animals

import Animal

class Dog(power: Int, weight: Int, maxAge: Int, name: String) : Animal(power, weight, maxAge, name) {

    override fun move() {
        println("$name - бежит")
    }

    /*
    override fun born(): Animal {
        return Animal(power = 10, weight = 10, maxAge = 30, name = "Dog-10")    }*/
   /* override fun addToNaturalReserve() {
        super.addToNaturalReserve()
    }*/

    override fun animalCopy(): Animal {
        return Animal(power = 10, weight = 10, maxAge = 30, name = "Dog-10")
    }


    override fun toString() = "Имя: $name, энергия: $power, возраст: $currentAge, вес: $weight, ++++++++++"

}