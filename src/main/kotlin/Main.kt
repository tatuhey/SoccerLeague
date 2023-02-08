/*
    ID      : 30065695
    NAME    : Raihan Khalil Abdillah
    AT1 - Portofolio 1, Activity 6, Task D
    Soccer League
 */

fun main(args: Array<String>){
    val p : Array<Player> = arrayOf(
        Player(9, "Ronaldo", "Forward"),
        Player(7, "David", "Midfielder"),
        Player(17, "Fabio", "Defender"),
        Player()
    )

    val t : Array<Team> = arrayOf(
        Team("Real Madrid", p[0].namePlayer),
        Team("United", p[1].namePlayer),
        Team("Parma", p[2].namePlayer)
    )

    val g :Array<Game> = arrayOf(
        Game("Bernabeu", t[0].nameTeam, 2, t[1].nameTeam, 1),
        Game("Trafford", t[1].nameTeam, 3, t[2].nameTeam, 0),
        Game("Tardini", t[2].nameTeam, 1, t[0].nameTeam, 0)
    )

    val l : Array<League> = arrayOf(
        League(t[0].nameTeam, "La Liga"),
        League(t[1].nameTeam, "Premier League"),
        League(t[2].nameTeam, "Serie A")
    )

    val o : Array<Goal> = arrayOf(
        Goal(p[0].numberPlayer, 32, true),
        Goal(p[1].numberPlayer, 44, false),
        Goal(p[2].numberPlayer, 12, false)
    )

    p[0].displayPlayerInfo()
    p[1].displayPlayerInfo()
    p[2].displayPlayerInfo()
    p[3].displayPlayerInfo()
    println("--")
    t[0].displayTeamInfo()
    t[1].displayTeamInfo()
    t[2].displayTeamInfo()
    println("--")
    g[0].displayGameInfo()
    g[1].displayGameInfo()
    g[2].displayGameInfo()
    println("--")
    l[0].displayLeagueInfo()
    l[1].displayLeagueInfo()
    l[2].displayLeagueInfo()
    println("--")
    o[0].displayGoalInfo()
    o[1].displayGoalInfo()
    o[2].displayGoalInfo()

}