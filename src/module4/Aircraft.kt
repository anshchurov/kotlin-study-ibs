package module4

import kotlin.system.measureTimeMillis

abstract class Aircraft(protected val number: Int, protected val maxDist: Double, protected val tank: Double) {

    val consumption: Double
        get() {
            return 100 * tank / maxDist
        }

    open fun print() {
        println("stats:\nnumber: ${number}\nmax distance: ${maxDist}\nmax fuel: ${tank}")
    }
}

class Boeing747(val passengers: Int, number: Int, maxDist: Double, tank: Double) : Aircraft(number, maxDist, tank),
    Passangers {
    override val count: Int = passengers

    override fun print() {
        println("stats:\nnumber: ${number}\nmax distance: ${maxDist}\nmax fuel: ${tank}\nmax passangers: ${count}")
    }

    fun getNumber() = "'${number}'"

}

interface Passangers {
    val count: Int
        get() = 0
}