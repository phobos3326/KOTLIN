import animals.Bird
import animals.Dog
import animals.Fish

class NatureReserve {


    var dogOne = Dog(power = 10, weight = 10, maxAge = 30, name = "Dog-1")
    var dogTwo = Dog(power = 10, weight = 10, maxAge = 30, name = "Dog-2")

    var birdOne = Bird(power = 10, weight = 10, maxAge = 10, name = "Bird-1")
    var birdTwo = Bird(power = 10, weight = 10, maxAge = 10, name = "Bird-2")
    var birdThree = Bird(power = 10, weight = 10, maxAge = 10, name = "Bird-3")
    var birdFour = Bird(power = 10, weight = 10, maxAge = 10, name = "Bird-4")
    var birdFive = Bird(power = 10, weight = 10, maxAge = 10, name = "Bird-5")

    var fishOne = Fish(power = 10, weight = 10, maxAge = 10, name = "Fish-1")
    var fishTwo = Fish(power = 10, weight = 10, maxAge = 10, name = "Fish-2")
    var fishThree = Fish(power = 10, weight = 10, maxAge = 10, name = "Fish-3")

    var animalOne = Animal(10, 10, 10, "Animal-1")


    val animals = mutableListOf(
        dogOne,
        dogTwo,

        birdOne,
        birdTwo,
        birdThree,
        birdFour,
        birdFive,

        fishOne,
        fishTwo,
        fishThree,
        animalOne
    )

   fun out(){
   }

}




