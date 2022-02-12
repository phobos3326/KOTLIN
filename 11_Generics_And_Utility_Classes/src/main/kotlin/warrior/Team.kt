package warrior


import java.util.*
import kotlin.random.Random
import kotlin.random.nextInt

class Team {
    private val arrayTeam = mutableListOf<AbstractWarrior>()
    fun createTeam(count:Int): MutableList<AbstractWarrior> {

      /* var count:Int

        do {
            println("введите количество участников для команды")
             count = Scanner(System.`in`).nextInt()
        } while (count<=0)*/



        for (i in 1..count) {
            when (Random.nextInt(1..100)) {
                in 1..50 -> arrayTeam.add(Soldier.createWarrior())
                in 51..90 -> arrayTeam.add(Captain.createWarrior())
                in 91..100 -> arrayTeam.add(General.createWarrior())
            }
        }
        return arrayTeam
    }
}



