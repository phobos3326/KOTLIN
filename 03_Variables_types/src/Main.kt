fun main() {


    val firstName = "Andrey"
    val lastName = "Adamov"
    var height: Double
    val weight: Float
    var isChild = false

    height = 178.0
    weight = 75f

    isChild = height <= 150.0 && weight <= 40f
    var info: String = """
            | First Name: $firstName, 
            | Last Name: $lastName, 
            | Height: $height, 
            | Weight: $weight,
            | isChild: $isChild""".trimMargin()

    println(info)
    println()

    height = 190.0

    isChild = height <= 150.0 && weight <= 40f
    info = """
            | First Name: $firstName, 
            | Last Name: $lastName, 
            | Height: $height, 
            | Weight: $weight,
            | isChild: $isChild""".trimMargin()


    println(info)


}
