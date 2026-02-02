class Hero(val name: String) {
    var health: Int = 100
        set(value) {
            field = value.coerceIn(0, 100)
        }

    val stamina: Int
        get() = 50 + (health / 10)

    var level: Int = 1
        private set

    fun levelUp() {
        level++
        println("$name повысил уровень! Теперь уровень: $level")
    }
}

fun main() {
    val hero = Hero("Артур")

    hero.health = 120
    println("Здоровье: ${hero.health}")
    println("Выносливость: ${hero.stamina}")

    // hero.level = 5
    hero.levelUp()
    println("Уровень: ${hero.level}")
}