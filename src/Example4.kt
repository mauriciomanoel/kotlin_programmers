fun main(args: Array<String>) {

    println(whatShouldIDoToday("sad", "Rainy"))
}

fun isHappySunny(mood: String, weather:String ): Boolean = (mood == "happy" && weather == "Sunny")
fun isSadRainy(mood: String, weather:String): Boolean = (mood == "sad" && weather == "Rainy")

fun whatShouldIDoToday(mood: String, weather:String = "sunny", temperature: Int = 24): String {

    return when {
        isHappySunny(mood, weather) -> "go for a walk"
        isSadRainy(mood, weather) -> "go home"
        else -> "Stay home and read."
    }
}
