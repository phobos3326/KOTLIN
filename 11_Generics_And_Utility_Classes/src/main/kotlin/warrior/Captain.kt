package warrior

import weapon.AbstractWeapon
import weapon.Weapons

class Captain : AbstractWarrior() {
    override val maxHealth: Int = 100

    override var avoidance: Int = 70

    override var accuracy: Int = 80

    override var currentHealth: Int = maxHealth

    override val weapon: AbstractWeapon = Weapons.createSniperRifle()

    override val chanceOfAvoidingDamage: Int = 80

    override val name = "капитан"


    companion object {
        fun createWarrior(): AbstractWarrior {
            return Captain()
        }
    }

    override fun toString(): String {
        return "$name, текущее здоровье $currentHealth"
    }

}