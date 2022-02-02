package warrior

import weapon.AbstractWeapon
import weapon.Weapons

class Captain : AbstractWarrior() {
    override val maxHealth: Int = 100

    override val avoidance: Int
        get() = 70

    override val accuracy: Int
        get() = 80

    override var currentHealth: Int = maxHealth

    override val weapon: AbstractWeapon
        get() = Weapons.createMachineGun()

    override val chanceOfAvoidingDamage: Int = 80



}