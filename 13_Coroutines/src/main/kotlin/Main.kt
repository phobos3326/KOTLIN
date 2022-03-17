

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel
import java.math.BigInteger



fun main() = runBlocking {
    val start = System.currentTimeMillis()

//    val data = async(Dispatchers.Default) {

    /*launch(Dispatchers.Default) {


        val a = 10000
        val j = 1..a
        for (i in j) {

            fib2.take(i)

        }

        println("coroutine 00   ${Thread.currentThread().name}   ${(System.currentTimeMillis() - start) / 1000F}")
        println("${fib2.cache[a]}")
        //  println("coroutine 00 $result")

    }*/


    // display(result.toString())
    //println("принт ЛН  $")
    //job.cancel()


    /* CoroutineScope(Dispatchers.Default).launch {

             val time = (System.currentTimeMillis() - start) / 10000f
             if (time > 0.009) {
                 currentCoroutineContext().cancel()
             } else {
                 println("coroutine 1  ${Fib.takeIter(10)} ${Thread.currentThread().name}   $time")
             }

            // if(coroutineContext.isActive)
            Fib.takeIter(10)


     }*/

   launch(Dispatchers.Default) {
        //Fib.checkExeption(999)
        println("${(System.currentTimeMillis() - start) / 1000F} ${Fib.takeIter(10_000)}")
        // println("coroutine 2  ${Fib.takeIter(100)}${Thread.currentThread().name}   ${(System.currentTimeMillis() - start) / 10000F}")
        // return@launch
    }


    coroutineScope {
        launch {
            //Fib.checkExeption(100)
            withTimeout(1000) {
                println("${(System.currentTimeMillis() - start) / 1000F}  ${Fib.takeIter(100_000)}")
                cancel()
            }

            // println("coroutine 3  ${Fib.takeIter(500)}  ${Thread.currentThread().name}   ${(System.currentTimeMillis() - start) / 10000F}")
        }
    }

    println()
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
        override fun get(n: Int): BigInteger {
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
    };

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
/*
fun main() = runBlocking {

    val job = launch {
        repeat(1000) { i ->
            println("job: I'm sleeping $i ...")
            delay(500L)
        }
    }
    delay(10000L) // delay a bit
    println("main: I'm tired of waiting!")
    job.cancelAndJoin()// cancels the job
   // job.join() // waits for job's completion
    println("main: Now I can quit.")
}
*/



    fun main11() {
        println(fibonacci.take(1000).toList())
    }

val fibonacci = sequence {
    var cur = 1
    var next = 1
    while (true) {
        yield(cur)
        val tmp = cur + next
        cur = next
        next = tmp
    }
}