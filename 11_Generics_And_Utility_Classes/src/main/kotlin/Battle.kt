import warrior.AbstractWarrior
import warrior.Team
import warrior.Warrior
import kotlin.random.Random
import kotlin.random.nextInt

class Battle {
    private val tempArray = mutableListOf<Warrior>()
    private var teamOne = Team()
    private var teamTwo = Team()

    private val isBattleEnd: Boolean
        get() = teamOne.arrayTeam.size == 0 || teamTwo.arrayTeam.size == 0


    private fun getBattleInfo(tm: Team): Int {
        var a = 0
        tm.arrayTeam.forEach { warrior ->
            a += warrior.currentHealth
        }
        return a
    }

    fun goBattle() {


        teamOne.createTeam()
        teamTwo.createTeam()


        while (!isBattleEnd) {

            val rnd = Random.nextInt(1..2)
            val randomWarriorTeamOne = Random.nextInt(0 until teamOne.arrayTeam.size)
            val randomWarriorTeamTwo = Random.nextInt(0 until teamTwo.arrayTeam.size)

            if (rnd == 1) {

                teamOne.arrayTeam[randomWarriorTeamOne].attack(teamTwo.arrayTeam[randomWarriorTeamTwo])


            } else if (rnd == 2) {
                teamTwo.arrayTeam[randomWarriorTeamTwo].attack(teamOne.arrayTeam[randomWarriorTeamOne])
            }
            removeWarrior(teamOne)
            removeWarrior(teamTwo)

            println(" current Heath team 1 ${getBattleInfo( teamOne)}")
            println(" current Heath team 2 ${getBattleInfo( teamTwo)}")

        }

    }

    private fun removeWarrior(arr: Team): MutableList<AbstractWarrior> {
        arr.arrayTeam.forEach { warrior ->
            if (warrior.isKilled) {
                tempArray.add(warrior)
                println("воин team 2 $warrior выбыл")
            }
        }
        arr.arrayTeam.removeAll(tempArray.toSet())
        tempArray.clear()
        return arr.arrayTeam

    }

}