package warrior

import weapon.AbstractWeapon
import kotlin.random.Random

abstract class AbstractWarrior : Warrior {

    abstract val maxHealth: Int
    abstract var avoidance: Int
    abstract var accuracy: Int
    abstract var currentHealth: Int
    abstract val weapon: AbstractWeapon

    override var isKilled: Boolean = false


    override fun getDamage(incomingDamage: Int): Int {
        currentHealth -= incomingDamage
        if (currentHealth<0){
            isKilled = true
        }
        return currentHealth
    }

    override fun attack(enemyWarrior: Warrior) {
        if (!weapon.isLoaded) {
            weapon.reloadWeapon()
        } else if (isAccuracy() >= enemyWarrior.chanceOfAvoidingDamage) {
            // weapon.getAmmo()
            enemyWarrior.getDamage(weapon.getAmmo())
        } else if (isAccuracy() < enemyWarrior.chanceOfAvoidingDamage) {
            println("is missed")
        }
    }

    private fun isAccuracy(): Int {
        val randomValues = Random.nextInt(accuracy, 100)
        accuracy = randomValues
        return accuracy
    }
}