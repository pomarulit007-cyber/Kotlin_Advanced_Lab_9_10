class EnergyGenerator : OutpostModule("Генератор энергии"), ModuleAction {
    override fun performAction(manager: ResourceManager) {
        execute(manager)
    }

    override fun execute(manager: ResourceManager) {
        val energyResource = manager.get("Энергия")
        if (energyResource == null) {
            manager.add(OutpostResource(id = 3, name = "Энергия", amount = 50))
            println("Генератор создал 50 единиц энергии")
        } else {
            energyResource.amount += 30
            println("Генератор добавил 30 единиц энергии")
        }
    }
}