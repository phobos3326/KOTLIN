import com.sun.tools.javac.Main
import kotlinx.coroutines.*
import java.math.BigInteger

suspend fun main() {
    val start = System.currentTimeMillis()

    coroutineScope {

        launch {
            val a = 10000
            val j = 1..a
            for (i in j) {
                fib2.take(i)
            }
            println(fib2.cache[a])
            println("coroutine 00   ${Thread.currentThread().name}   ${(System.currentTimeMillis() - start) / 1000F}")
        }

        launch {
            val time = (System.currentTimeMillis() - start) / 10000F
            if (time > 0.009) {
                currentCoroutineContext().cancel()
            }else{
                println("coroutine 1  ${fib.takeIter(10)} ${Thread.currentThread().name}   $time")
            }
        }

        launch {
            println("coroutine 2  ${fib.takeIter(100)}${Thread.currentThread().name}   ${(System.currentTimeMillis() - start) / 10000F}")
        }

        launch {
            println("coroutine 3  ${fib.takeIter(50000)}  ${Thread.currentThread().name}   ${(System.currentTimeMillis() - start) / 10000F}")
        }
    }
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
    /*  ITERATIVE {
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
      },*/
    /*RECURSIVE {
        override fun get(n: Int):BigInteger {
            return if (n < 2) {
                n.toBigInteger()
            } else {
                this[n - 1] + this[n - 2]
            }
        }
    },*/
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

/*fun main1() {
    val r = 0..100
    for (fib in Fibonacci.values()) {
        println("${fib.name.padEnd(10)}:")
        for (i in r) {
            println("$i " + fib[i])
        }
        println()
    }
}*/


/*
suspend fun main()= coroutineScope {                                // A function that can be suspended and resumed later
    val start = System.currentTimeMillis()
                                // Create a scope for starting coroutines
        for (i in 1..10) {
            launch {                                // Start 10 concurrent tasks
                delay(3000L - i * 3000)              // Pause their execution
                log(start, "Countdown: $i")
            }
        }

    // Execution continues when all coroutines in the scope have finished
    log(start, "Liftoff!")
}

fun log(start: Long, msg: String) {
    println("$msg " +
            "(on ${Thread.currentThread().name}) " +
            "after ${(System.currentTimeMillis() - start)/1000F}s")
}*/
/*
fun main(args: Array<String>) {
    fun fibonacci() = sequence {
        var n1 = BigInteger("0")
        var n2 = BigInteger("1")
        var terms = Pair(n1, n2)

        // this sequence is infinite
        while (true) {
            yield(terms.first)
            terms = Pair(terms.second, terms.first + terms.second)
        }
    }

    println(fibonacci().take(10000).toList()) // [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
}*/


/*
 fun main() {
    repeat(3) {
        GlobalScope.launch {
            println("Hi from ${Thread.currentThread()}")
        }
    }
}*/
