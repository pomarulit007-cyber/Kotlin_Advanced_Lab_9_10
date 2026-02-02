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