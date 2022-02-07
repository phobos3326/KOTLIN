import warrior.Team

sealed class BattleState {

    object Progress : BattleState()
    class FirstTeamWin(val team: Team) : BattleState()
    class SecondTeamWin(val team: Team) : BattleState()
    object Draw:BattleState()

}