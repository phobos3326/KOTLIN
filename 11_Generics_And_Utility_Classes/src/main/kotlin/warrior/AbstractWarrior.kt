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
        if (currentHealth < 0) {
            isKilled = true
        }
        return currentHealth
    }

    override fun attack(enemyWarrior: Warrior) {
        val randomValues = Random.nextInt(accuracy, 100)
        if (!weapon.isLoaded) {
            weapon.reloadWeapon()
        } else if (randomValues >= enemyWarrior.chanceOfAvoidingDamage) {
            enemyWarrior.getDamage(weapon.getAmmo())
        } else if (randomValues < enemyWarrior.chanceOfAvoidingDamage) {
            println("is missed")
        }
    }


}