package module4

fun main(args: Array<String>){

    val air1: Aircraft = Aircraft(12345, 6666.0, 6.0)
    val air2: Aircraft = Aircraft(76543, 9000.0, 9.0)
    val air3: Aircraft = Aircraft(34786, 70000.0, 15.0)

    println("Расход на 100 км для самолёта ${air1.number} = ${air1.consumption}")
    println("Расход на 100 км для самолёта ${air2.number} = ${air2.consumption}")
    println("Расход на 100 км для самолёта ${air3.number} = ${air3.consumption}")


}
