import warrior.General
import weapon.Ammo
import weapon.Weapons

fun main() {


    // здесь пока только проверка отдельных функций

    var sum = 0
    repeat(100) {
        val aa = Ammo.SECONDBULLET.gettingCurrentDamage()
       // println(aa)
        if (aa == 70) sum += 1
    }
    println("$sum  70")



    /*val weapon = Weapons.createSniperRifle()

    println(weapon.isLoaded)
    repeat(29) {
        weapon.getAmmo()
        println("______________")
    }
    println(weapon.isLoaded)*/
    //val wep2 = Weapons.createPistol()
    //println(wep2.isLoaded)

    val gen = General().getDamage(80)

    println(gen)

}


