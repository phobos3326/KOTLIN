package warrior

import weapon.AbstractWeapon
import weapon.Weapons

class General : AbstractWarrior() {
    override val maxHealth: Int = 100

    override val avoidance: Int
        get() = 70

    override val accuracy: Int
        get() = 80

    override var currentHealth: Int = maxHealth
        set(value) {
            field = value
        }


    override val weapon: AbstractWeapon
        get() = Weapons.createPistol()


    override val isKilled: Boolean
        get() = currentHealth == 0

    override val chanceOfAvoidingDamage: Int = 80


}



