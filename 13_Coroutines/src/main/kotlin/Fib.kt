import kotlinx.coroutines.*

import java.math.BigInteger
import kotlin.coroutines.AbstractCoroutineContextElement
import kotlin.coroutines.CoroutineContext


object Fib {
    val start = System.currentTimeMillis()
    suspend fun takeIter(n: Int): BigInteger {
        yield()
        var n1 = BigInteger("0")
        var n2 = BigInteger("1")

        if (n < 2) {
            n.toBigInteger()
        } else {
            n1
            n2
            var i = 1
            repeat(n) {
                //yield()
                i++
                val sum = n1 + n2
                n1 = n2
                n2 = sum
            }
        }
        return n1
    }

    class EcxeptionNumber(message: String) : Exception(message)
    private fun exceptionFib() {
        throw EcxeptionNumber("вычисление слишком долгое")
    }

    private fun checkException() {
        try {
            exceptionFib()
        } catch (e: TimeoutCancellationException) {
            // println("вычисление слишком долгое")
        }
    }

}





