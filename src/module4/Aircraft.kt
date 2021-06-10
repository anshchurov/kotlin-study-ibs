package module4

class Aircraft(val number: Int, val maxDist: Double, val tank: Double) {

    val consumption: Double
        get() {
            return 100 * tank / maxDist
        }
}