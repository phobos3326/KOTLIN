import warrior.General
import warrior.Soldier
import weapon.Ammo
import weapon.Weapons

fun main() {


    // здесь пока только проверка отдельных функций

    /* var sum = 0
     repeat(100) {
         val aa = Ammo.BULLET.gettingCurrentDamage()
       //   println(aa)
         if (aa == 2) sum += 1
     }
     println("$sum  2")*/


    /* val weapon = Weapons.createSniperRifle()

     println(weapon.isLoaded)
     repeat(29) {
         weapon.getAmmo()
         println("______________")
     }
     println(weapon.isLoaded)*/

    //val wep2 = Weapons.createPistol()
    //println(wep2.isLoaded)


    val soldier = Soldier()

    val general = General()


    for (i in 1..general.maxHealth) {
        if (!general.isKilled) {
            println(general.currentHealth)
            soldier.attack(general)
        } else
           break
    }

}


