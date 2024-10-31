fun main() {
    val buildMaterials = mutableMapOf(
        "Sediment" to "Dirt",
        "Rock" to "Stone",
        "Liquid" to "Lava"
    )
    buildMaterials["Woods"] = "Spruce"
    buildMaterials["Liquid"] = "Water"
    buildMaterials.remove("Sediment")
    println(buildMaterials)
}