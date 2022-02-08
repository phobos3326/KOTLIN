package warrior

import weapon.AbstractWeapon
import weapon.Weapons

class Captain : AbstractWarrior() {
    override val maxHealth: Int = 100

    override var avoidance: Int = 70

    override var accuracy: Int = 80

    override var currentHealth: Int = maxHealth

    override val weapon: AbstractWeapon = Weapons.createMachineGun()

    override val chanceOfAvoidingDamage: Int = 80

    fun createWarrior(): AbstractWarrior {
        return Captain()
    }

}