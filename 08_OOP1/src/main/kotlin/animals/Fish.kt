package animals

import Animal

class Fish(power: Int, weight: Int, maxAge: Int, name: String) : Animal(power, weight, maxAge, name) {

    override fun move() {
        super.move()
        println("$name - плывет")
    }

    override fun animalCopy(): Fish {
        println("$name - рожает")
        return Fish(power = pow, weight = wgt, maxAge = 30, name)
    }

}