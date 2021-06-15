package module4

fun main(args: Array<String>) {

    var car1 = auto("BMW", "black", "o000oo")
    var car2 = auto("Ford", "red", "a111aa")
    println(car1)
    println(car2)
}


data class auto(val mark: String, val color: String, val number: String)