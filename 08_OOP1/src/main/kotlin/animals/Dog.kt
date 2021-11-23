package animals

import Animal

class Dog(power: Int, weight: Int, maxAge: Int, name: String) : Animal(power, weight, maxAge, name) {


    override fun move() {
        super.move()
        println("$name - бежит")
    }

    override fun animalCopy(): Dog {
        println("$name - рожает")
       return Dog(power=pow, weight=wgt, maxAge , name)
    }

}