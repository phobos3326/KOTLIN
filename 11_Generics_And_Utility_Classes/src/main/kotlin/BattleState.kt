import warrior.AbstractWarrior
import warrior.Team

sealed class BattleState {



    class Progress : BattleState()



    class FirstTeamWin() : BattleState()
    class SecondTeamWin() : BattleState()
    object Draw : BattleState()

}