package animals

import Animal

class Bird(power: Int, weight: Int, maxAge: Int, name: String) : Animal(power, weight, maxAge, name) {


    override fun move() {
        super.move()
        println("$name - летит---")
    }

    override fun animalCopy(): Animal {
        println("$name - рожает")
        return Bird(power=pow, weight=wgt, maxAge = 30, name = "Bird РОДИЛСЯ ")
    }

}