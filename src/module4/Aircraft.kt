package module4


abstract class Aircraft(protected val number: Int, protected val maxDist: Double, protected val tank: Double) {

    val consumption: Double
        get() {
            return 100 * tank / maxDist
        }

    open fun print() {
        println("stats:\nnumber: ${number}\nmax distance: ${maxDist}\nmax fuel: ${tank}")
    }

    fun getNumber1(): Int {
        return number
    }
}

class Boeing747(private val passengers: Int, number: Int, maxDist: Double, tank: Double) :
    Aircraft(number, maxDist, tank),
    Passangers {
    override val count: Int = passengers

    override fun print() {
        println("stats:\nnumber: ${number}\nmax distance: ${maxDist}\nmax fuel: ${tank}\nmax passangers: ${count}")
    }

}

class Airbus380(val passengers: Int, number: Int, maxDist: Double, tank: Double) : Aircraft(number, maxDist, tank),
    Passangers {
    override val count: Int = passengers
}

class Douglas(val cargo: Int, number: Int, maxDist: Double, tank: Double) : Aircraft(number, maxDist, tank),
    Payload {
    override val tonns: Int = cargo
    override fun print() {
        println("stats:\nnumber: '${number}'\nmax distance: ${maxDist} km\nmax fuel: ${tank}\nmax payload: ${tonns} tonns")
    }
}
