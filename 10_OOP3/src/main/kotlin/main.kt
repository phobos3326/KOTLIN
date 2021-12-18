fun main() {

    val convertersObject = ConvertersObject
    println("введите конвертируемую в рубль валюту: usd, euro или другую")

    val read = readLine().toString()
    convertersObject.get(read).convertToRub(2f)
    println(convertersObject)


}

