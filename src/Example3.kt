fun main(args: Array<String>) {


//    for (i in 1..10) {
//        var fortune:String = getFortuneCookie()
//        println("Your fortune is: $fortune")
//        if (fortune.contains("Take it easy")) break
//    }

    println(getFortuneCookie())

}

fun getBirthday():Int {

    print("\nEnter your birthday: ")
    return readLine()?.toIntOrNull() ?: 1
}

fun getFortuneCookie(): String {

    val myList = listOf("You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.")

    val birthday:Int = getBirthday()


    val index = when(birthday) {
        in 1..7 -> 4
        28,31 -> 2
        else -> birthday.rem(myList.size)
    }

    return myList[index]
}

