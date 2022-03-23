import kotlinx.coroutines.*


suspend fun main() {
    val start = System.currentTimeMillis()
    coroutineScope {
        val job = async(Dispatchers.IO) {
            val a = Fib.takeIter(100000)
            return@async a
        }
        val job2 = async(Dispatchers.Default) {
            val resss = withTimeout(500L) {
                val b = Fib.takeIter(100000)
                return@withTimeout b
            }
            return@async resss
        }
        launch {
            while (true) {
                delay(100)
                print(".")
                if (job.isCompleted) {
                    val result = job.await()
                    println()
                    println("первая  ${(System.currentTimeMillis() - start) / 1000F}  $result")
                    cancel()
                }

                if (job2.isCompleted) {
                    val result2 = job2.await()
                    println()
                    println("вторая  ${(System.currentTimeMillis() - start) / 1000F}  $result2")
                    cancel()
                }
            }
        }
    }
}


