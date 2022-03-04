import java.math.BigInteger
import java.util.*

/*
fun main() = runBlocking {
}
*/


/*
fun main() {
    var n: Int

    do {
        println("input number >0")
        n = readLine()?.toIntOrNull() ?: return
    } while (n <= 0)
    fibo(n)
   // var l = Long.MAX_VALUE
    //println("Lon $l")

    //println(fib(n))
}
*/





fun fibo(number: Int) {

    fun Long.toBigInteger() = BigInteger.valueOf(this)
    fun Int.toBigInteger() = BigInteger.valueOf(toLong())
    //val n = 10

    val a = number.toBigInteger()

    val arr = LongArray(number)
    arr[0] = 0
    arr[1] = 1
    for (i in 2 until arr.size) {
        arr[i] = arr[i - 1] + arr[i - 2]
        println(arr[i])
    }
    //return arr.maxOf { it }.toLong()
}


fun fib(number: Int): Long {
    //val n = 10
    val arr = LongArray(number + 1)
    arr[0] = 0
    arr[1] = 1

    for (i in 2 until number)
        arr[i] = arr[i - 1] + arr[i - 2]
    return arr.maxOf { it }.toLong()

}


fun fi11b(number: Int): Long {


    //val n = 10
    val arr = LongArray(number + 1)
    arr[0] = 0
    arr[1] = 1

    for (i in 2 until number)
        arr[i] = arr[i - 1] + arr[i - 2]
    return arr.maxOf { it }.toLong()

}

enum class Fibonacci {
    ITERATIVE {
       override fun get(n: Int): BigInteger = if (n < 2) {
            n.toBigInteger()
        } else {
           var n1 = BigInteger("0")
           var n2 = BigInteger("1")
            repeat(n) {
                val sum = n1 + n2
                n1 = n2
                n2 = sum
            }
            n1
        }
    },
      RECURSIVE {
          override fun get(n: Int):BigInteger {
              return if (n < 2) {
                  n.toBigInteger()
              } else {
                  this[n - 1] + this[n - 2]
              }
          }
      },
     CACHING {
         var a = 0
         var b = 1
         private val cache: MutableMap<Int, BigInteger> = mutableMapOf(0 to a.toBigInteger(), 1 to b.toBigInteger())
         override fun get(n: Int): BigInteger = if (n < 2) n.toBigInteger() else impl(n)
         private fun impl(n: Int): BigInteger = cache.computeIfAbsent(n) { impl(it - 1) + impl(it - 2) }
     },
    ;

    abstract operator fun get(n: Int): BigInteger
}

fun main() {
    val r = 0..100
    for ( fib in Fibonacci.values()) {
        println("${fib.name.padEnd(10)}:")
        for (i in r) {
            println("$i " + fib[i])
        }
        println()
    }
}