open class Animal(var power: Int, var weight: Int, val maxAge: Int, val name: String) {


    var currentAge: Int = 0

    init {
        isTooOld()
        sleep()
        eat()
        this.move()
    }

    fun isTooOld(): Boolean {
        when {
            currentAge >= maxAge -> {
                return true
            }
        }
        return false
    }

    fun sleep() {
        currentAge += 1
        power += 5
        println("$name - спит")

    }

    fun eat() {
        power += 3
        weight += 1
        val a = (0..1).random()
        currentAge += a
        println("$name - ест")

    }

    open fun move(){
        power-=5
        weight-=1
        val a = (0..1).random()
        currentAge += a
        println("$name - передвигается")

    }

    override fun toString() = "Имя: $name, энергия: $power, возраст: $currentAge, вес: $weight"

    fun info(){
        println("Имя: $name, энергия: $power, возраст: $currentAge, вес: $weight")
    }

}