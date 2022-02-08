package warrior

import weapon.AbstractWeapon
import weapon.Weapons

class General : AbstractWarrior() {
    override val maxHealth: Int = 200

    override var avoidance: Int = 90

    override var accuracy: Int = 80

    override var currentHealth: Int = maxHealth

    override val weapon: AbstractWeapon = Weapons.createPistol()

    override val chanceOfAvoidingDamage: Int = 80

    fun createWarrior(): AbstractWarrior {
        return General()
    }

}



