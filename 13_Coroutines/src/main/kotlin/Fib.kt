import kotlinx.coroutines.*

import java.math.BigInteger

object Fib {
    suspend fun takeIter(n: Int): BigInteger {
        yield()
        var n1 = BigInteger("0")
        var n2 = BigInteger("1")

        if (n < 2) {
            n.toBigInteger()
        } else {
            var i = 1
            repeat(n) {
                i++
                val sum = n1 + n2
                n1 = n2
                n2 = sum
            }
        }
        return n1
    }
}








