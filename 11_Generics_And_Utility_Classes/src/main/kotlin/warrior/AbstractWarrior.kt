package warrior

import weapon.AbstractWeapon

abstract class AbstractWarrior : Warrior {

    abstract val maxHealth: Int
    abstract val avoidance: Int
    abstract val accuracy: Int
    abstract var currentHealth: Int
    abstract val weapon: AbstractWeapon

    override val isKilled: Boolean
        get() = currentHealth <= 0

    override fun getDamage(incomingDamage: Int): Int {
        currentHealth -= incomingDamage
        return currentHealth
    }

    override fun attack(enemyWarrior: Warrior) {
        if (!weapon.isLoaded) {
            weapon.reloadWeapon()
        } else {
            weapon.getAmmo()
            enemyWarrior.getDamage(weapon.createAmmo().damage)
        }
    }
}