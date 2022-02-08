package warrior

import kotlin.random.Random
import kotlin.random.nextInt

class Team {


   var arrayTeam = mutableListOf<AbstractWarrior>()


   fun createTeam() {
        val general = General()
        val soldier = Soldier()
        val captain = Captain()

        for (i in 1..10) {
            when (Random.nextInt(1..100)) {
                in 1..50 -> arrayTeam.add(soldier.createWarrior())
                in 51..90 -> arrayTeam.add(captain.createWarrior())
                in 91..100 -> arrayTeam.add(general.createWarrior())
            }
        }
    }
}