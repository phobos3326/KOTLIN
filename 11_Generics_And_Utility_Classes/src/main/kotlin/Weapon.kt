object Weapons {

    fun createPistol(): AbstractWeapon {
        val pistol = object : AbstractWeapon(
            12,
            fireType = FireType.SingleShot
        ) {}
        pistol.reloadWeapon()
        return pistol

    }


    fun createAssaultRifle(): AbstractWeapon {
        val assaultRifle = object : AbstractWeapon(
            30, fireType = FireType.MachineGun(3)
        ) {}
        assaultRifle.reloadWeapon()
        return assaultRifle

    }

}