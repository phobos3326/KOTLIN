package animals

import Animal

class Dog(power: Int, weight: Int, maxAge: Int, name: String) : Animal(power, weight, maxAge, name) {

    /*override fun move() {
        println("$name - бежит")
    }*/


    override fun move() {
        super.move()
        println("$name - бежит")
    }

    override fun animalCopy(): Animal {

       return Dog(power=pow, weight=wgt, maxAge , name = "DOG РОДИЛСЯ")
    }

   // override fun toString() = "Имя: $name, энергия: $power, возраст: $currentAge, вес: $weight"

    override fun tryCopy() {
        super.tryCopy()
    }
}