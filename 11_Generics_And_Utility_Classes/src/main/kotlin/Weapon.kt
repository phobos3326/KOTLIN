object Weapons {


    fun createPistol(): AbstractWeapon {
        val pistol = object : AbstractWeapon(
            12,
            fireType = FireType.SingleShot

        ) {
            override fun createAmmo(): Ammo {
                return Ammo.BULLET
            }
        }

        pistol.reloadWeapon()
        return pistol

    }


    fun createAssaultRifle(): AbstractWeapon {
        val assaultRifle = object : AbstractWeapon(
            30, fireType = FireType.MachineGun(3),
            ) {
            override fun createAmmo(): Ammo {
                return Ammo.SECONDBULLET
            }
        }
        assaultRifle.reloadWeapon()
        return assaultRifle

    }

    fun createMachineGun(): AbstractWeapon {
        val machineGun = object : AbstractWeapon(
            60, fireType = FireType.MachineGun(8),
        ) {
            override fun createAmmo(): Ammo {
                return Ammo.THIRDBULLET
            }
        }
        machineGun.reloadWeapon()
        return machineGun

    }



}