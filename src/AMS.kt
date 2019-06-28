import kotlin.random.Random

fun main(args: Array<String>) {
   feedTheFish()
    println(fitMoreFish(8.0, listOf(2,2,2), hasDecorations=false))
}

fun feedTheFish() {

    val day = randomDay()
    val food = fishFood(day)
    println ("Today is $day and I prefer $food")
}

fun fitMoreFish(tankSize: Double, currentFish:List<Int>,  fishSize: Int = 2, hasDecorations: Boolean = true  ): Boolean {

    print(currentFish.sum());

    return (tankSize * if (hasDecorations) 0.8 else 1.0) >= (currentFish.sum() + fishSize)


}

fun randomDay(): String {

    val weekList = listOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thurdsday", "Friday", "Saturday");
    return weekList[Random.nextInt(7)]
}

fun fishFood(day: String): String {

    return when(day) {
        "Sunday" -> "Comida Sunday"
        "Monday" -> "Comida Monday"
        "Tuesday" -> "Comida Tuesday"
        "Wednesday" -> "Comida Wednesday"
        "Thurdsday" -> "Comida Thurdsday"
        "Friday" -> "Comida Friday"
        "Saturday" -> "Comida Saturday"
        else ->  "fasting"
    }
}
