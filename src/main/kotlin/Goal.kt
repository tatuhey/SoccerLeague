class Goal(val numberPlayer: Int, val distance: Int, val openPlay: Boolean) {
    fun displayGoalInfo() {
        if (!openPlay) {
            println("The player number $numberPlayer scored from $distance yards away. They did not score from an open play.")
        } else {
            println("The player number $numberPlayer scored from $distance yards away. They scored from an open play.")
        }


    }
}