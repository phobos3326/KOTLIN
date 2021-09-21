fun main() {


    val firstName = "Andrey"
    val lastName = "Adamov"

    var height = 178.0
    val weight = 75f

    var isChild:Boolean = height < 150.0 || weight < 40f
    var info: String = """
            | First Name: $firstName, 
            | Last Name: $lastName, 
            | Height: $height, 
            | Weight: $weight,
            | isChild: $isChild""".trimMargin()

    println(info)
    println()

    height = 190.0

    isChild = height < 150.0 || weight < 40f
    info = """
            | First Name: $firstName, 
            | Last Name: $lastName, 
            | Height: $height, 
            | Weight: $weight,
            | isChild: $isChild""".trimMargin()


    println(info)


}
