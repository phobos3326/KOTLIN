interface CurrencyConverter {
    var currencyCode: String

    fun convertToRub(from: Float)
}