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



    val weapon = Weapons.createAssaultRifle()
    println(weapon.isLoaded)
    repeat(5) {
        weapon.getAmmo()
        println("______________")
    }
    weapon.reloadWeapon()
    println(weapon.isLoaded)
}


