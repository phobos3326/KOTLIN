import kotlinx.coroutines.*


suspend fun main() {
    val start = System.currentTimeMillis()
    coroutineScope {
        val job = async(Dispatchers.IO) {
            // delay(1000)
            val a = Fib.takeIter(100000)
            // println("firs ${(System.currentTimeMillis() - start) / 1000F} $a ")
            return@async a
        }

        val job2 = async(Dispatchers.Default) {

            val resss = withTimeout(50L) {
                val b = Fib.takeIter(100000)
                return@withTimeout b
            }

            // println("second ${(System.currentTimeMillis() - start) / 1000F} $b ")
            return@async resss
        }
        launch {
            while (true) {
                delay(100)
                print(".")

                if (job.isCompleted) {
                    // val result:BigInteger
                    //val res = withTimeout(5) {
                    val result = job.await()


                    println()
                    println("первая  ${(System.currentTimeMillis() - start) / 1000F}  $result")

                    cancel()
                }

                if (job2.isCompleted) {
                    // val result:BigInteger
                    //val res = withTimeout(5) {

                    val result2 = job2.await()

                    println()

                    println("вторая  ${(System.currentTimeMillis() - start) / 1000F}  $result2")
                    cancel()
                }
            }
        }
    }
}


