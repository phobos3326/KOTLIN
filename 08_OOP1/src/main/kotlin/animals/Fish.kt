package animals

import Animal

class Fish(power: Int, weight: Int, maxAge: Int, name: String):Animal(power, weight, maxAge, name) {
    override fun move() {
        println("$name - плывет")
    }

    override fun animalCopy(): Animal {
        return Fish (power=pow, weight=wgt, maxAge = 30, name = "Fish  РОДИЛСЯ")
    }

    override fun tryCopy() {
        super.tryCopy()
    }
}