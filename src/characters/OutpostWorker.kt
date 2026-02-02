package characters

class OutpostWorker(val name: String) {
    var maxEnergy: Int = 100
        private set

    var energy: Int = 100
        set(value) {
            field = value.coerceIn(0, maxEnergy)
        }

    val mood: Int
        get() = 50 + (energy / 10)

    var level: Int = 1
        private set

    fun work() {
        println("$name начинает работу")
        energy -= 15

        if (energy < 20) {
            println("Внимание! У $name низкий уровень энергии!")
        }
    }

    fun rest() {
        println("$name отдыхает")
        energy += 20
    }

    fun levelUp() {
        level++
        maxEnergy += 20
        energy = maxEnergy
        println("$name повысил уровень! Новый уровень: $level, макс. энергия: $maxEnergy")
    }
}

fun main() {
    val worker = OutpostWorker("Иван")

    println("Начальное состояние:")
    println("Энергия: ${worker.energy}")
    println("Настроение: ${worker.mood}")

    worker.work()
    println("После работы: энергия=${worker.energy}, настроение=${worker.mood}")

    worker.rest()
    println("После отдыха: энергия=${worker.energy}")


    worker.levelUp()
    println("После повышения: уровень=${worker.level}, макс.энергия=${worker.maxEnergy}")
}