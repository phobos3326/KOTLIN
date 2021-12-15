import converters.EuroToRub
import converters.UsdToRub

object ConvertersObject {

    override fun toString(): String {
        return a
    }

    var a = "Singleton class invoked."

    init {
        println(a)
    }


    val usd = UsdToRub()
    val euro = EuroToRub()

    val listCurrency = listOf(
        usd,
        euro
    )


    fun get(currencyCode: String): CurrencyConverter {

        return if (currencyCode == "usd") {
            usd
        }else{
            euro
        }


    }


}