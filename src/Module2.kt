fun main(args: Array<String>) {
    module2_task8()
//    module2_task9()
//    module2_task10()
//    module2_task11()
}

fun module2_task8() {
    print("Введите сумму вклада:")
    var sum = readLine().toString().toDouble()
    print("Введите длительность вклада:")
    var time = readLine().toString().toInt()
    print("Введите ежемесячный процент:")
    var percent = readLine().toString().toDouble()

    for (i in 1..time) {
        val profit = sum * (percent / 100)
        sum += profit
        println("Вам пришло ${profit}, итоговая сумма на вкладе: ${sum}")
    }
}

fun module2_task9() {
    var table: Array<Array<String>> = Array(3, { Array(3, { "" }) })
    table[0] = arrayOf("Россия", "Москва", "RUB")
    table[1] = arrayOf("США", "Вашингтон", "USD")
    table[2] = arrayOf("Англия", "Лондон", "GBP")
    println("Страна\t\tСтолица\t\tВалюта")
    for (el in table)
        println("${el[0]}\t\t${el[1]}\t\t${el[2]}")

}

fun module2_task10() {
    var cities: ArrayList<String> = ArrayList(0)
//    cities.add("qwe")
//    cities.add("rty")
//    cities.add("asd")
//    cities.add("qwe")
//    cities.add("zxc")
    program@ while (true) {
        println("Выход: 1\nДобавить новый город: 2\nПосмотреть список городов: 3\nПосмотреть уникальные города: 4")
        var input = readLine().toString().toInt()
        when (input) {
            1 -> break@program
            2 -> {
                print("Введите название города: ")
                var name = readLine().toString()
                cities.add(name)
            }
            3 -> {
                println("Все города в списке:")
                for (el in cities)
                    println(el)
            }
            4 -> {
                println("Все уникальные города в списке:")
                for (el in cities.distinct())
                    println(el)
            }
            else -> {
                println("Не понятно...")
                continue@program
            }
        }
    }
}

fun module2_task11() {
    var places: HashMap<Int, String> = HashMap()
    places.put(1, "Гимадиев Эдуард Марсович")
    places.put(2, "Стрельцов Николай Игоревич")
    places.put(3, "Авласенок Денис Сергеевич")
    program@ while (true) {
        println("Выход: 1\nЗанять какое-то место: 2\nПосмотреть кто занял место: 3")
        var input = readLine().toString().toInt()
        when (input) {
            1 -> break@program
            2 -> {
                val keyWord = "нет"
                print("Номер занимаемого места: ")
                var newNumber = readLine().toString().toInt()
                var busy = false
                if (places.containsKey(newNumber)) {
                    print("ALARM! Это место уже занято. Введите '${keyWord}', если не хотите выгонять сотрудника. ")
                    busy = true
                }
                print("Введите ФИО сотрудника для места ${newNumber}: ")
                var newName = readLine().toString()
                if (busy and newName.equals(keyWord))
                    continue@program
                places.put(newNumber, newName)
                println("${newName} занял место ${newNumber}")
            }
            3 -> {
                print("Введите номер интересующего Вас места:")
                var num = readLine().toString().toInt()
                println("Место ${num} занимает многоуважаемый(-ая) ${places.get(num)}")
            }
            else -> {
                println("Не понятно...")
                continue@program
            }
        }
    }
}
