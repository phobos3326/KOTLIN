fun main() {


    // здесь пока только проверка отдельных функций

    var sum = 0
    repeat(100) {
        val aa = Ammo.SECONDBULLET.gettingCurrentDamage()
        println(aa)
        if (aa == 70) sum += 1
    }
    println(sum)

    FireType.SingleShot
    FireType.MachineGun(5)
    println(FireType.MachineGun(5))


//    val wep = Weapon(12, FireType.SingleShot).createAmmo(Ammo.SECONDBULLET)
    //val wepp = Weapons()

    // wepp.reloadWeapon(Ammo.BULLET)
/*
    pistol.reloadWeapon()
    println(pistol.isLoaded)
    pistol.getAmmo()
    println(pistol.isLoaded)*/

    val weapon = Weapons.createAssaultRifle()
    println(weapon.isLoaded)
    weapon.getAmmo()
    println(weapon.isLoaded)
}


