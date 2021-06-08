package modules1_3

fun main(args: Array<String>) {
    module1_task1()
//    modules1_3.module1_task2()
//    modules1_3.module1_task3()
//    modules1_3.module1_task4()
//    modules1_3.module1_task5()
//    modules1_3.module1_task6()
//    modules1_3.module1_task7()
}

fun module1_task1() {
    var ex: Any? = null
    ex = 1
    var newVar = ex / 2.5 //Any?
    print("Any?")
}

fun module1_task2() {
    var hello: String
    val ibs: String? = "aplana"
    hello = "hello"
    println("$hello " + ibs)
}

fun module1_task3() {
    var five: Char = '5'
    println(five.toString() is String)
    println(five.toByte() is Byte)
    println(five.toShort() is Short)
    println(five.toInt() is Int)
    println(five.toDouble() is Double)
    println(five.toFloat() is Float)
    println(five.toLong() is Long)
}

fun module1_task4() {
    print("enter your name:")
    var input: String? = readLine()
    println("your name is ${input.toString()}!")
}

fun module1_task5() {
    var tebahpla = 'z'..'a'
    println(tebahpla)
}

fun module1_task6() {
    print("enter a:")
    var a = readLine()
    print("enter b:")
    var b = readLine()
    println("a>b? ${if (a.toString().toDouble() > b.toString().toDouble()) "YES" else "NO"}!")
}

fun module1_task7() {
    var res = 0
    print("Какого числа этот курс началася? ")
    var startDate = readLine()
    if (startDate.toString().toInt() == 2) res++

    print("Какого числа этот курс закончится? ")
    var endDate = readLine()
    if (endDate.toString().toInt() == 14) res++

    print("Сколько дней на прохождение курса не считая дня сдачи? ")
    var days = readLine()
    if (days.toString().toInt() == 42) res++

    print("Какое это задание? ")
    var seven = readLine()
    if (seven.toString().toInt() == 7) res++

    print("Сколько в курсе модулей? ")
    var modules = readLine()
    if (modules.toString().toInt() == 4) res++

    when (res) {
        0 -> println("слишком быстро...")
        1 -> println("один раз попал...")
        2 -> println("рандомишь?")
        3 -> println("ты старался?")
        4 -> println("Промахнулся где-то?")
        5 -> println("М-молодца!")
        else -> println("Читер!")
    }


}
