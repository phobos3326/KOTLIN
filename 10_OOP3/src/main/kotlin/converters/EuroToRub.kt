package converters

import CurrencyConverter

class EuroToRub() : CurrencyConverter {

    init {
        info()
    }

    override var value = 83f


    override var currencyCode: String = "euro"


  override fun convertToRub(from: Float, to: Float) {
      val result = (from / to * value)
      println(result)
    }

    fun info() {
        println("euro converter")
    }
}