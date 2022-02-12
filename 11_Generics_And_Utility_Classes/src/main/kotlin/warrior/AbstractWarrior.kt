package warrior

import weapon.AbstractWeapon
import kotlin.random.Random

abstract class AbstractWarrior : Warrior {

    abstract val maxHealth: Int
    abstract var avoidance: Int
    abstract var accuracy: Int
    abstract var currentHealth: Int
    abstract val weapon: AbstractWeapon
    abstract val name:String

    override val isKilled: Boolean
        get()=  currentHealth <= 0



    override fun getDamage(incomingDamage: Int) {
        currentHealth -= incomingDamage
       /* if (currentHealth <= 0) {
            isKilled = true
        }*/
    }

    override fun attack(enemyWarrior: AbstractWarrior) {
        val randomValues = Random.nextInt(accuracy, 100)
        /*if (!weapon.isLoaded) {
            weapon.reloadWeapon()
            println("пропустил ход")*/
         if (randomValues >= enemyWarrior.chanceOfAvoidingDamage) {
            var summOfAmmoDamage = 0
            weapon.getAmmo().forEach { ammo -> summOfAmmoDamage += ammo.gettingCurrentDamage() }
            enemyWarrior.getDamage(summOfAmmoDamage)
            println("damage $summOfAmmoDamage")
        } else if (randomValues < enemyWarrior.chanceOfAvoidingDamage) {
            println("is missed")
        }
    }

    override fun toString(): String {
        return "$name, текущее здоровье $currentHealth"
    }
}