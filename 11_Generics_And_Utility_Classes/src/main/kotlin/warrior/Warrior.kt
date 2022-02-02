package warrior

interface Warrior {

    val isKilled:Boolean
    val chanceOfAvoidingDamage: Int


    fun attack(enemyWarrior: Warrior)
    fun getDamage(incomingDamage:Int):Int
}