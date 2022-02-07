import warrior.AbstractWarrior
import warrior.Team
import warrior.Warrior
import kotlin.random.Random
import kotlin.random.nextInt

class Battle {
    val tempArray = mutableListOf<Warrior>()
    var teamOne = Team()
    var teamTwo = Team()
    var isBattleEnd: Boolean = false

    fun getBattleInfo(tm: Team): Int {
        var a = 0
        tm.arrayTeam.forEach { warrior ->
            a += warrior.currentHealth
        }
        return a
    }

    fun goBattle() {


        teamOne.createTeam()
        teamTwo.createTeam()



        for (i in 1..100) {

            val randomWarriorTeamOne = Random.nextInt(0 until teamOne.arrayTeam.size)
            val randomWarriorTeamTwo = Random.nextInt(0 until teamTwo.arrayTeam.size)
            val rnd = Random.nextInt(1..2)


            if (rnd == 1) {
                teamOne.arrayTeam[randomWarriorTeamOne].attack(teamTwo.arrayTeam[randomWarriorTeamTwo])
                println("team1 attack ${teamTwo.arrayTeam[randomWarriorTeamTwo]}")
                println(getBattleInfo(teamOne))

                teamOne.arrayTeam.forEach { warrior ->
                    if (warrior.isKilled) {
                        tempArray.add(warrior)
                        println("воин $warrior выбыл")
                    }

                }

                teamOne.arrayTeam.removeAll(tempArray)

            } else if (rnd == 2) {
                teamTwo.arrayTeam[randomWarriorTeamTwo].attack(teamOne.arrayTeam[randomWarriorTeamOne])
                println("team2 attack ${teamOne.arrayTeam[randomWarriorTeamOne]}")
                println(getBattleInfo(teamTwo))

                teamTwo.arrayTeam.forEach { warrior ->
                    if (warrior.isKilled) {
                        tempArray.add(warrior)
                        println("воин $warrior выбыл")
                    }

                }
                teamOne.arrayTeam.removeAll(tempArray)
            } else if (teamOne.arrayTeam.size == 0 || teamTwo.arrayTeam.size == 0) {
                println("финиш")
                break
            }


        }


    }

}