fun main(args: Array<String>) {
//    module3_task12()
//    module3_task13()
//    module3_task14()
//    module3_task15()
    module3_task16()
}

fun module3_task12() {
    val year = 2020
    println(checkLeapYear(year))
}

fun checkLeapYear(year: Int): Boolean {
    return (year % 4 == 0) and (year % 100 != 0) or (year % 400 == 0)
}

fun module3_task13() {
    println("Сотрудников: ${countEmployeers("Иван", "Алексей", "Сергей", "Петр")}")
}

fun countEmployeers(vararg names: String): Int {
    return names.size
}

fun module3_task14() {
    var employes: ArrayList<Employee> = ArrayList(0)
    employes.add(Employee("qwe", "boss", 50, "free"))
    employes.add(Employee("qwe", "manager", 45, "free"))
    employes.add(Employee("asd", "middle", 30, "married"))
    employes.add(Employee("asd", "middle", 40, "free"))
    employes.add(Employee("asd", "middle", 45, "married"))
    employes.add(Employee("zxc", "junior", 30, "married"))

    print(employes, "qwe", "boss")
    print(employes, "asd", 40, "middle")
    print(employes, "asd", "free", "middle")
    print(employes, "asd", 45, "married", "middle")

}

fun print(employes: ArrayList<Employee>, name: String, post: String) {
    for (employy in employes)
        if (employy.name.equals(name) && employy.post.equals(post))
            println(employy.toString())
}

fun print(employes: ArrayList<Employee>, name: String, age: Int, post: String) {
    for (employy in employes)
        if (employy.name.equals(name) && employy.age == age && employy.post.equals(post))
            println(employy.toString())
}

fun print(employes: ArrayList<Employee>, name: String, status: String, post: String) {
    for (employy in employes)
        if (employy.name.equals(name) && employy.status.equals(status) && employy.post.equals(post))
            println(employy.toString())
}

fun print(employes: ArrayList<Employee>, name: String, age: Int, status: String, post: String) {
    for (employy in employes)
        if (employy.name.equals(name) && employy.age == age && employy.status.equals(status) && employy.post.equals(post))
            println(employy.toString())
}

class Employee {
    public var name: String? = null
    public var post: String? = null
    public var age: Int? = null
    public var status: String? = null

    constructor(name: String?, post: String?, age: Int?, status: String?) {
        this.name = name
        this.post = post
        this.age = age
        this.status = status
    }

    override fun toString(): String {
        return "Employee(name=$name, post=$post, age=$age, status=$status)"
    }

}

fun module3_task15() {
    val lambda = { array: ArrayList<String> -> for (v in array) println(v) }
    val h = lambda(arrayListOf("asd", "qwe", "zxc"))
}

fun module3_task16() {
    fun Double.sqrt() {
        var res = this
        val precision = 0.00000000001
        while (Math.abs(res * res - this) > precision)
            res = (res + this / res) / 2
        println("sqrt(${this}) = ${res}")
    }
    val nine: Double = 9.0
    val eleven: Double = 11.0
    nine.sqrt()
    eleven.sqrt()
}