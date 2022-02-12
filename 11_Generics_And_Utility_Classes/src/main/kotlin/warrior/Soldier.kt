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
    override val name: String = "солдат"



    companion object{
        fun createWarrior(): AbstractWarrior {
            return Soldier()
        }
    }

    override fun toString(): String {
        return "$name, текущее здоровье $currentHealth"
    }
}
