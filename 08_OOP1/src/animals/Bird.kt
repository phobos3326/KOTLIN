package animals

import Animal

class Bird(power: Int, weight: Int, maxAge: Int, name: String) : Animal(power, weight, maxAge, name) {

    override fun move() {
        println("$name - Летит")

    }
}