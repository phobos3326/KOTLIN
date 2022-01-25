object Weapons {


    fun createPistol(): AbstractWeapon {
        val pistol = object : AbstractWeapon(
            maxAmmo = 12,
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
            maxAmmo = 30, fireType = FireType.MachineGun(3),
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
            maxAmmo = 60, fireType = FireType.MachineGun(8),
        ) {
            override fun createAmmo(): Ammo {
                return Ammo.THIRDBULLET
            }
        }
        machineGun.reloadWeapon()
        return machineGun

    }

    fun sniperRifle(): AbstractWeapon {
        val sniperRifle = object : AbstractWeapon(maxAmmo = 10, fireType = FireType.SingleShot) {
            override fun createAmmo(): Ammo {
                return Ammo.THIRDBULLET
            }
        }
        sniperRifle.reloadWeapon()
        return sniperRifle
    }

}