import animals.Bird
import animals.Dog

class NatureReserve() {


    var dogOne = Dog(power = 10, weight = 10, maxAge = 30, name = "Dog-1")
    var dogTwo = Dog(power = 10, weight = 10, maxAge = 30, name = "Dog-2")
    var bird = Bird(power = 10, weight = 10, maxAge = 10, name = "Bird-1")



    val animals = mutableListOf(
        dogOne,
        dogTwo,
        bird,
    )




}
