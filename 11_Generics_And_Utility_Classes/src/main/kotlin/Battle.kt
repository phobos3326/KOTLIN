import warrior.AbstractWarrior
import warrior.Team
import warrior.Warrior
import java.io.BufferedReader
import java.io.InputStream
import java.util.*
import kotlin.random.Random
import kotlin.random.nextInt

class Battle {

    private val tempArray = mutableListOf<Warrior>()

    private var teamOne = Team().createTeam(0)
    private var teamTwo = Team().createTeam(0)

    private val ic1 = TeamSize.InsertSizeTeamOne
    private val ic2 = TeamSize.InsertSizeTeamTwo

    private val isBattleEnd: Boolean
        get() = teamOne.size == 0 || teamTwo.size == 0

    private fun insertSize(): Int {
        var count: Int
        do {
            println("количество участников должно быть больше 0")
            count = Scanner(System.`in`).nextInt()
        } while (count <= 0)
        return count
    }



    private fun getTeamSize(teamSize: TeamSize) {
        when (teamSize) {
            is TeamSize.InsertSizeTeamOne -> {
                println("введите количество участников для команды 1")
                teamOne = Team().createTeam(insertSize())
            }

            is TeamSize.InsertSizeTeamTwo -> {
                println("введите количество участников для команды 2")
                teamTwo = Team().createTeam(insertSize())
            }
        }
    }

    private fun getBattleInfo(tm: MutableList<AbstractWarrior>): Int {
        var teamCurrentHealth = 0
        tm.forEach { warrior ->
            teamCurrentHealth += warrior.currentHealth
        }
        return teamCurrentHealth
    }

    fun goBattle() {

        getTeamSize(ic1)
        getTeamSize(ic2)

        val obj1 = BattleState.Progress()
        val obj2 = BattleState.FirstTeamWin()
        val obj3 = BattleState.SecondTeamWin()
        val obj4 = BattleState.Draw

        while (!isBattleEnd) {
            battleInfo(obj1)

            val rnd = Random.nextInt(1..2)
            val randomWarriorTeamOne = Random.nextInt(0 until teamOne.size)
            val randomWarriorTeamTwo = Random.nextInt(0 until teamTwo.size)

            if (rnd == 1) {
                teamOne[randomWarriorTeamOne].attack(teamTwo[randomWarriorTeamTwo])
            } else if (rnd == 2) {
                teamTwo[randomWarriorTeamTwo].attack(teamOne[randomWarriorTeamOne])
            }
            removeWarrior(teamOne)
            removeWarrior(teamTwo)

            battleInfo(obj1)
            battleInfo(obj2)
            battleInfo(obj3)
            battleInfo(obj4)
        }
    }

    private fun battleInfo(battleState: BattleState) {
        when (battleState) {
            is BattleState.Progress -> {
                !isBattleEnd
                println(" current Heath team 1 ${getBattleInfo(teamOne)}, Heath team 2 ${getBattleInfo(teamTwo)}")
                println("-----------------")
            }
            is BattleState.FirstTeamWin -> {
                if (getBattleInfo(teamTwo) == 0) {
                    println("победила команда 1")
                    teamOne.forEach {
                        println(it)
                    }
                }
            }
            is BattleState.SecondTeamWin -> {
                if (getBattleInfo(teamOne) == 0) {
                    println("победила команда 2")
                    teamTwo.forEach {
                        println(it)
                    }
                }
            }
            is BattleState.Draw -> if (
                teamOne.size == 0 && teamTwo.size == 0
            ) {
                println("ничя")
            }

        }
    }

    private fun removeWarrior(arr: MutableList<AbstractWarrior>): MutableList<AbstractWarrior> {
        arr.forEach { warrior ->
            if (warrior.isKilled) {
                tempArray.add(warrior)
                // println("воин team 2 $warrior выбыл")
            }
        }
        arr.removeAll(tempArray.toSet())
        tempArray.clear()
        return arr
    }
}


sealed class TeamSize {
    object InsertSizeTeamOne : TeamSize()
    object InsertSizeTeamTwo : TeamSize()

}


