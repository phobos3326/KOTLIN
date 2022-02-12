package warrior

interface Warrior {

    val isKilled:Boolean
    val chanceOfAvoidingDamage: Int

    fun attack(enemyWarrior: AbstractWarrior)
    fun getDamage(incomingDamage:Int)
}