import fib2.cache
import kotlinx.coroutines.*

import java.math.BigInteger
import kotlin.coroutines.coroutineContext


object fib {


    suspend fun takeIter(n: Int): BigInteger {
        //currentCoroutineContext().isActive
        if (n < 2) {
            return n.toBigInteger()
        } else {
            var n1 = BigInteger("0")
            var n2 = BigInteger("1")
            repeat(n) {
                val sum = n1 + n2
                n1 = n2
                n2 = sum
            }

            return n1
        }

    }

}


object fib2 {

    var a = 0
    var b = 1


    val cache: MutableMap<Int, BigInteger> = mutableMapOf(0 to a.toBigInteger(), 1 to b.toBigInteger())
    suspend fun take(n: Int): BigInteger = if (n < 2) n.toBigInteger() else impl(n)

    fun impl(n: Int): BigInteger {
        return cache.computeIfAbsent(n) { impl(it - 1) + impl(it - 2) }
    }


}