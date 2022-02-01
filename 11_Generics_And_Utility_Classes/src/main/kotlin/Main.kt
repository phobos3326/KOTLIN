fun main() {


    // здесь пока только проверка отдельных функций

    var sum = 0
    repeat(100) {
        val aa = Ammo.SECONDBULLET.gettingCurrentDamage()
       // println(aa)
        if (aa == 70) sum += 1
    }
    println("$sum  70")



    val weapon = Weapons.sniperRifle()
    val wep2 = Weapons.createPistol()
    println(weapon.isLoaded)
    repeat(29) {
        weapon.getAmmo()
        println("______________")
    }
    println(weapon.isLoaded)

    println(wep2.isLoaded)
}


