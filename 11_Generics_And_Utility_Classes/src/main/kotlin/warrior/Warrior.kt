package warrior

interface Warrior {

    var isKilled:Boolean
    val chanceOfAvoidingDamage: Int

    fun attack(enemyWarrior: AbstractWarrior)
    fun getDamage(incomingDamage:Int)
}