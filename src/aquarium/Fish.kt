package aquarium

class Fish(var friendly: Boolean = true, volumeNeed: Int) {
    var size: Int

    constructor(number: Int): this(true, 10) {
        println("Constructor")
    }

    init {
        println("Aqui 1")
    }
    init {
        println("Aqui 2")
        if (friendly) {
            size = volumeNeed
        } else {
            size = volumeNeed * 2
        }

    }

    init {
        println("Aqui 3")
    }
}