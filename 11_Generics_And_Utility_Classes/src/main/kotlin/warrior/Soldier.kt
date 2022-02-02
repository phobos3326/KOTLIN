package warrior

import weapon.AbstractWeapon
import weapon.Weapons

class Soldier : AbstractWarrior() {
    override val maxHealth: Int = 80

    override val avoidance: Int
        get() = 70

    override val accuracy: Int
        get() = 80

    override var currentHealth: Int = maxHealth

    override val weapon: AbstractWeapon
        get() = Weapons.createPistol()

    override val chanceOfAvoidingDamage: Int = 80

}
