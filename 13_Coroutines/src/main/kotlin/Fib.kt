import kotlinx.coroutines.*

import java.math.BigInteger
import kotlin.coroutines.AbstractCoroutineContextElement
import kotlin.coroutines.CoroutineContext


object Fib {
    val start = System.currentTimeMillis()
    suspend fun takeIter(n: Int):BigInteger{
        //currentCoroutineContext().isActive
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

            //return@withTimeout n1
        return n1

//println(res)
        //checkException()

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


object fib2 {

    var a = 0
    var b = 1


    val cache: MutableMap<Int, BigInteger> = mutableMapOf(0 to a.toBigInteger(), 1 to b.toBigInteger())
    fun take(n: Int): BigInteger = if (n < 2) n.toBigInteger() else impl(n)

    fun impl(n: Int): BigInteger {
        return cache.computeIfAbsent(n) { impl(it - 1) + impl(it - 2) }
    }


}


data class UserData(
    val id: Long,
    val name: String,
    val age: Int
) : AbstractCoroutineContextElement(UserData) {
    companion object Key : CoroutineContext.Key<UserData>

    val userData = UserData(1, "name1", 10)
    val scope = CoroutineScope(Job() + Dispatchers.Default + userData)


}
