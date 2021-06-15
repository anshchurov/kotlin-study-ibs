package module4

fun main(args: Array<String>) {

    var park: ArrayList<Aircraft> = ArrayList()
    park.add(Boeing747(467, 823746, 14310.0, 193.3))
    park.add(Airbus380(625, 237846, 15400.0, 121.3))
    park.add(Douglas(286, 974362, 13408.0, 218.5))

    program@ while (true) {
        println("Выход: 1\nВывести список самолётов: 2\nВывести информацию по самолёту: 3")
        var input = readLine().toString().toInt()
        when (input) {
            1 -> break@program
            2 -> {
                for (aircraft in park) {
                    println(aircraft.getNumber1())
                }
            }
            3 -> {
                println("Введите номер самолёта:")
                var num = readLine().toString().toString()
                for (aircraft in park){
                    if (aircraft.getNumber1().toString().equals(num)){
                        aircraft.print()
                    }
                }
            }
        }
    }
}