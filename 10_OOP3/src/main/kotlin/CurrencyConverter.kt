interface CurrencyConverter {
    var currencyCode: String
    var value:Float

    fun convertToRub(from: Float, to: Float) {
        val result = (from / to * value)
        println(result)


    }
}