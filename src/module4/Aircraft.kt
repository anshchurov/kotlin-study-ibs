package module4

open class Aircraft(val number: Int, val maxDist: Double, val tank: Double) {

    val consumption: Double
        get() {
            return 100 * tank / maxDist
        }
}

class Boeing747(val passangeres: Int, number: Int, maxDist: Double, tank: Double): Aircraft(number, maxDist, tank){

}