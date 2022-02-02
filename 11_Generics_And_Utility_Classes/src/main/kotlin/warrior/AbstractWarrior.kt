package warrior

import weapon.AbstractWeapon
import weapon.Weapons


abstract class AbstractWarrior: Warrior {

    abstract val maxHealth: Int
    abstract val avoidance: Int
    abstract val accuracy: Int
    abstract var currentHealth: Int
    abstract val weapon: AbstractWeapon

    override fun attack(enemyWarrior: Warrior) {
        if (!weapon.isLoaded) {
            weapon.reloadWeapon()
        } else {
            weapon.getAmmo()
        }


    }

    override fun getDamage(incomingDamage: Int): Int {
        currentHealth -= incomingDamage
        return currentHealth
    }
}