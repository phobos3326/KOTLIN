package animals

import Animal

class Fish(power: Int, weight: Int, maxAge: Int, name: String):Animal(power, weight, maxAge, name) {
    override fun move() {
        println("$name - плывет")
    }
}