package module4

class Aircraft {
    var number: Int = 1001
        get() {
            return field
        }
        set(value) {
            if (value < 1000)
                println("Некорректный номер судна!")
            else
                field = value
        }

    var maxDist: Double = 0.0
        get() {
            return field
        }
        set(value) {
            if (value <= 1000)
                println("Самолёт должен иметь возможность лететь больше!")
            else
                field = value
        }

    var tank: Double = 0.0
        get() {
            return field
        }
        set(value) {
            if (value <= 0)
                println("Самолёт без бака?!")
            else
                field = value
        }
    val consumption: Double
        get() {
            return 100 * tank / maxDist
        }

    constructor(number: Int, maxDist: Double, fuel: Double) {
        this.number = number
        this.maxDist = maxDist
        this.tank = fuel
    }
}