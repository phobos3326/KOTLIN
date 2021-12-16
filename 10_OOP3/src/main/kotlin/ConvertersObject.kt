import converters.EuroToRub
import converters.UsdToRub

object ConvertersObject {

    private val usd = UsdToRub()
    private val euro = EuroToRub()

    fun get(currencyCode: String): CurrencyConverter {

        return if (currencyCode == "usd") {
            usd
        } else {
            euro
        }
    }


}