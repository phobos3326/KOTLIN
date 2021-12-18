package converters

import CurrencyConverter

class EuroToRub : CurrencyConverter {


    var value = 83f


    override var currencyCode: String = "usd"


    override fun convertToRub(from: Float) {
        val result = (from  * value)
        println("$result рублей = $from $currencyCode")
    }

    fun info() {
        println("euro converter")
    }

}