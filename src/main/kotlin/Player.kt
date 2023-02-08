class Player {
    var numberPlayer: Int = 999
    var namePlayer: String = ""
    var positionPlayer: String = ""

    constructor(){
        numberPlayer = 999
        namePlayer = ""
        positionPlayer = ""
    }
    constructor(numberPlayer: Int){
        this.numberPlayer = numberPlayer
        namePlayer = ""
        positionPlayer = ""
    }
    constructor(numberPlayer: Int, namePlayer: String, positionPlayer: String){
        this.numberPlayer = numberPlayer
        this.namePlayer = namePlayer
        this.positionPlayer = positionPlayer
    }

    fun displayPlayerInfo(){
        println("Name: $namePlayer, Jersey Number: $numberPlayer, Position: $positionPlayer.")
    }
}