import warrior.General
import warrior.Soldier
import warrior.Team

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


  /*  val soldier = Soldier()

    val general = General()


    for (i in 1..2) {
        if (!general.isKilled) {
            println(general.currentHealth)
            soldier.attack(general)
        } else
            break
    }*/

    val team = Team()
    team.createTeam()
    val team2 = Team()
    team2.createTeam()





  /*  team.createTeam()
    team2.createTeam()


    team.arrayFirstTeam.forEach {
        println(it)
    }
    println("________________________")
    team.arraySecondTeam.forEach {
        println(it)
    }*/


    val battle =Battle()
    battle.goBattle()
    println(battle.getBattleInfo(team))
    println(battle.getBattleInfo(team2))

}


