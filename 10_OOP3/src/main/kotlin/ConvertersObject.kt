import converters.EuroToRub
import converters.UsdToRub

object ConvertersObject {

    private val usd = UsdToRub()
    private val euro = EuroToRub()



    fun get(currencyCode: String): CurrencyConverter {

        /* if (currencyCode == "usd") {
             return usd
         } else  {
             return euro
         }*/

         return when (currencyCode) {
            "usd" ->  usd
            "euro" ->  euro
            else ->  qq
        }
    }


    private val qq = object : CurrencyConverter {
        override var currencyCode: String
            get() = readLine().toString()
            set(value) {}


        override fun convertToRub(from: Float) {
            val zz = readLine()?.toFloat()
            val result = (from / 1 * zz!!)
            println("$result рублей = $from $currencyCode")
        }


    }

}