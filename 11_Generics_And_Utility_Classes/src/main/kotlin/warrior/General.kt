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

    override val weapon: AbstractWeapon
        get() = Weapons.createSniperRifle()

    override val chanceOfAvoidingDamage: Int = 80



}



