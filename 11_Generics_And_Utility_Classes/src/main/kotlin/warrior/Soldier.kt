package warrior

import weapon.AbstractWeapon
import weapon.Weapons

class Soldier : AbstractWarrior() {
    override val maxHealth: Int = 200

    override var avoidance: Int = 50

    override var accuracy: Int = 60

    override var currentHealth: Int = maxHealth

    override val weapon: AbstractWeapon = Weapons.createAssaultRifle()

    override val chanceOfAvoidingDamage: Int = 80

    fun createWarrior(): AbstractWarrior {
        return Soldier()
    }


}
