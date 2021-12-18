import converters.EuroToRub
import converters.UsdToRub

object ConvertersObject {

    private val usd = UsdToRub()
    private val euro = EuroToRub()
    var a: String = ""

    fun get(currencyCode: String): CurrencyConverter {
        a = currencyCode
        return when (currencyCode) {
            "usd" -> usd
            "euro" -> euro
            else -> altCurrency
        }
    }


    private val altCurrency = object : CurrencyConverter {

        override var currencyCode: String
            get() = this.toString()
            set(value) {
                a
            }


        override fun convertToRub(from: Float) {
            println("введите значение курса")
            val altCurrencyValue = readLine()?.toFloat()
            val result = (from * altCurrencyValue!!)
            println("$result рублей = $from $a")
        }


    }

    override fun toString(): String {
        return ""
    }
}