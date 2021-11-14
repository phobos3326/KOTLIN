package animals

import Animal

class Bird(power: Int, weight: Int, maxAge: Int, name: String) : Animal(power, weight, maxAge, name) {



     override fun move() {
        println("$name - Летит")

    }


    override fun animalCopy(): Animal {
        return Bird(power=pow, weight=wgt, maxAge = 30, name = "Bird РОДИЛСЯ ")
    }



    override fun tryCopy() {
        super.tryCopy()
    }
}