import kotlinx.coroutines.*

import java.math.BigInteger
import kotlin.coroutines.AbstractCoroutineContextElement
import kotlin.coroutines.CoroutineContext


object Fib {
    suspend fun takeIter(n: Int): BigInteger {
        val start = System.currentTimeMillis()

        return withContext(Dispatchers.Default) {


            if (n < 2) {
                return@withContext n.toBigInteger()
            } else {
                var n1 = BigInteger("0")
                var n2 = BigInteger("1")
                var i = 1

                repeat(n) {

                    //cancel()

                    i++
                    /*if (i == 99) {
                    //delay(3000)
                 println(currentCoroutineContext().job)
                }*/


                    val sum = n1 + n2
                    n1 = n2
                    n2 = sum


                }

                //println("$n  $n1 ${Thread.currentThread().name} ${(System.currentTimeMillis() - start) / 1000F}")
                //println("${Thread.currentThread().name.padEnd(27)}    corutine ${n.toString().padEnd(10)}  ${n1.toString().padEnd(25)} ${((System.currentTimeMillis() - start) / 1000F).toString().padEnd(70)} ")
                checkExeption(i, n1)
                return@withContext n1
                //println(scope.coroutineContext)
            }


        }


    }

    class ExeptionNumber(message: String) : Exception(message)

    fun exceptionFib(i: Int, n1: BigInteger) {

        throw ExeptionNumber("число $i ,$n1")

    }

    fun checkExeption(i: Int, n1: BigInteger) {
        try {
            exceptionFib(i, n1)
        } catch (e: ExeptionNumber) {
            println(e.message)
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
