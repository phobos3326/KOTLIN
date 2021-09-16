    fun main() {


        var firstName = "Andrey"
        var lastName = "Adamov"
        var height = 140.0
        var weight = 38f
        var isChild = false



        isChild = height <= 150 || weight <= 40
        var info = """
        | First Name: $firstName, 
        | Last Name: $lastName, 
        | Height: $height, 
        | Weight: $weight,
        | isChild: $isChild""".trimMargin()

        println(info)



        height = 200.0
        weight = 100f

        isChild = height <= 150.0 && weight <= 38f

        println(
            """
        | First Name: $firstName, 
        | Last Name: $lastName, 
        | Height: $height, 
        | Weight: $weight,
        | isChild: $isChild""".trimMargin()
        )


    }
