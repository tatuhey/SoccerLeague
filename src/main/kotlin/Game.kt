class Game (val location: String, val nameTeamA : String, val scoreTeamA: Int, val nameTeamB: String, val scoreTeamB: Int){
    fun displayGameInfo(){
        println("$nameTeamA $scoreTeamA - $scoreTeamB $nameTeamB, at $location.")
    }

}