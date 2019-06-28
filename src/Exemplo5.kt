import kotlin.random.Random

fun main(args: Array<String>) {

    val rollDice = { face: Int -> if (face == 0) "0" else "Face $face, number ${Random.nextInt(13)}" }
    val rollDice2: (Int) -> String = { face: Int -> if (face == 0) "0" else "Face $face, number ${Random.nextInt(13)}" }


    //println(rollDice2(2) )
    gamePlay(rollDice2(2))
}

fun gamePlay(value: String) {
    println(value)
}



