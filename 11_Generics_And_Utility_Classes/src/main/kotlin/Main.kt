fun main() {
    var sum = 0
    repeat(100) {
        val aa = Ammo.SECONDBULLET.gettingCurrentDamage()
        println(aa)
        if (aa <= 50) sum += 1


    }
    println(sum)

    FireType.SingleShot
    FireType.MachineGun(5)
    println(FireType.MachineGun(5))

    val wep = Weapon(12, FireType.SingleShot).getBullet(Ammo.SECONDBULLET)
    val wepp = Weapon(12, FireType.SingleShot)
    wepp.reloadWeapon(Ammo.BULLET)
    wepp.isLoaded

    println(wepp)


}


