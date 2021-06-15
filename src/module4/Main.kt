package module4

fun main(args: Array<String>){

    val boeing: Boeing747= Boeing747(467, 823747, 14310.0, 193.3)

    println("В самолете ${boeing.getNumber()} ${boeing.passengers} пассажирских мест")
    boeing.print()
}
