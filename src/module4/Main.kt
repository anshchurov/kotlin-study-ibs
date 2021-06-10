package module4

fun main(args: Array<String>){

    val air1: Aircraft = Aircraft(12345, 6666.0, 6.0)
    val air2: Aircraft = Aircraft(76543, 9000.0, 9.0)
    val air3: Aircraft = Aircraft(34786, 70000.0, 15.0)

    val boeing: Boeing747= Boeing747(467, 823746, 14310.0, 193.3)

    println("Расход на 100 км для самолёта ${boeing.number} = ${boeing.consumption} тонны топлива")

}
