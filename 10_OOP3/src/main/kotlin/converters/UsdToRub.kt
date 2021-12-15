package converters

import CurrencyConverter

class UsdToRub() : CurrencyConverter {

    override var value = 73f

    init {
        info()
    }

    override var currencyCode: String = "usd"

    override fun convertToRub(from: Float, to: Float) {

        val result = (from / to * value)
        println(result)
    }

    fun info() {
        println("usd converter")
    }
}