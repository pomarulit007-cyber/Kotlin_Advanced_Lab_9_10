package example

data class Item(
    val id: Int,
    val name: String,
    val quantity: Int
)

fun main() {

    val item1 = Item(id = 1, name = "Меч", quantity = 1)
    val item2 = item1.copy(quantity = 5)

    println("Оригинал: $item1")
    println("Копия: $item2")

    val (id, name, quantity) = item1
    println("Декомпозиция: id=$id, name=$name, quantity=$quantity")
}

abstract class Human(val name: String) {
    abstract fun hello()
    abstract var age: Int
}

class Person(name: String, override var age: Int) : Human(name) {
    override fun hello() {
        println("My name is $name")
    }
}

abstract class Figure {
    abstract fun perimeter(): Float
    abstract fun area(): Float
}

class Rectangle(val width: Float, val height: Float) : Figure() {
    override fun perimeter(): Float {
        return 2 * (width + height)
    }

    override fun area(): Float {
        return width * height
    }
}

fun main() {

    // val human = example.Human("Иван")

    val person = Person("Иван", 25)
    person.hello()

    val rectangle = Rectangle(5f, 3f)
    println("Периметр прямоугольника: ${rectangle.perimeter()}")
    println("Площадь прямоугольника: ${rectangle.area()}")
}