package converters

import CurrencyConverter

class UsdToRub : CurrencyConverter {

    var value = 73f


    override var currencyCode: String = "usd"

    override fun convertToRub(from: Float) {

        val result = (from  * value)
        println("$result рублей = $from $currencyCode")
    }

    fun info() {
        println("usd converter")
    }
}