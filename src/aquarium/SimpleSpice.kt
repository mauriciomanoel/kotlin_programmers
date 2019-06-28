package aquarium

class SimpleSpice {
    var name: String = "curry"
    var level: String = "mild"
    val heat: Int
        get() { if (level == "spiciness") return 10 else return 5 }
}

fun main(args: Array<String>) {
    val simpleSpice = SimpleSpice()
    println("The name is ${simpleSpice.name} and picancia is ${simpleSpice.heat}")
    simpleSpice.level = "spiciness"
    println("The name is ${simpleSpice.name} and picancia is ${simpleSpice.heat}")
}