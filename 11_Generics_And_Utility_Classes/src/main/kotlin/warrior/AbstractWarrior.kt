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
        get()=  currentHealth <= 0



    override fun getDamage(incomingDamage: Int) {
        currentHealth -= incomingDamage
        if (currentHealth <= 0) {
            isKilled = true
        }
    }

    override fun attack(enemyWarrior: AbstractWarrior) {
        val randomValues = Random.nextInt(accuracy, 100)
        if (!weapon.isLoaded) {
            weapon.reloadWeapon()
        } else if (randomValues >= enemyWarrior.chanceOfAvoidingDamage) {
            var a = 0
            weapon.getAmmo().forEach { ammo -> a += ammo.gettingCurrentDamage() }
            enemyWarrior.getDamage(a)
            println("damage $a")
        } else if (randomValues < enemyWarrior.chanceOfAvoidingDamage) {
            println("is missed")
        }
    }


}