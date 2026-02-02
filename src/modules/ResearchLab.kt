package modules

import resources.OutpostResource
import resources.ResourceManager
import actions.ModuleAction

class ResearchLab : OutpostModule("Исследовательская лаборатория"), ModuleAction {
    override fun performAction(manager: ResourceManager) {
        execute(manager)
    }

    override fun execute(manager: ResourceManager) {
        val minerals = manager.get("Minerals")
        if (minerals == null || minerals.amount < 30) {
            println("Недостаточно минералов для исследования")
            return
        }

        minerals.amount -= 30
        println("Лаборатория проводит исследование (минералы -30)")
    }
}
fun main() {
    val manager = ResourceManager()
    manager.add(OutpostResource(id = 1, name = "Minerals", amount = 120))
    manager.add(OutpostResource(id = 2, name = "Gas", amount = 40))

    val generator = EnergyGenerator()
    val lab = ResearchLab()

    println()
    manager.printAll()


    generator.performAction(manager)
    lab.performAction(manager)

    println("")
    manager.printAll()
}