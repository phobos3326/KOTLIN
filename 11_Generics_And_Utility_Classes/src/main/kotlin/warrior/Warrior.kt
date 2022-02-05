package warrior

interface Warrior {

    var isKilled:Boolean
    val chanceOfAvoidingDamage: Int

    fun attack(enemyWarrior: Warrior)
    fun getDamage(incomingDamage:Int):Int
}