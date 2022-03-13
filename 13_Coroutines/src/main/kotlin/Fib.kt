import kotlinx.coroutines.*
import kotlinx.coroutines.GlobalScope.coroutineContext

import java.math.BigInteger
import kotlin.coroutines.coroutineContext
import kotlin.coroutines.suspendCoroutine


object Fib {
    suspend fun takeIter(n: Int):BigInteger {
        val start = System.currentTimeMillis()
       return withContext(Dispatchers.Default) {

                if (n < 2) {
                    n.toBigInteger()
                } else {
                    var n1 = BigInteger("0")
                    var n2 = BigInteger("1")
                    repeat(n) {

                        val sum = n1 + n2
                        n1 = n2
                        n2 = sum
                    }

                    //println("$n  $n1 ${Thread.currentThread().name} ${(System.currentTimeMillis() - start) / 1000F}")
                   //println("${Thread.currentThread().name.padEnd(27)}    corutine ${n.toString().padEnd(10)}  ${n1.toString().padEnd(25)} ${((System.currentTimeMillis() - start) / 1000F).toString().padEnd(70)} ")
                    return@withContext n1
            }


        }


    }



}


object fib2 {

    var a = 0
    var b = 1


    val cache: MutableMap<Int, BigInteger> = mutableMapOf(0 to a.toBigInteger(), 1 to b.toBigInteger())
    fun take(n: Int): BigInteger = if (n < 2) n.toBigInteger() else impl(n)

    fun impl(n: Int): BigInteger {
        return cache.computeIfAbsent(n) { impl(it - 1) + impl(it - 2) }
    }


}