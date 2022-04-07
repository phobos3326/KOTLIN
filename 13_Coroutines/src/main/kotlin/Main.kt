import kotlinx.coroutines.*


suspend fun main() {

    val start = System.currentTimeMillis()
    coroutineScope {
        val job = async(Dispatchers.Default) {
            return@async Fib.takeIter(100)
        }
        val job2 = async(Dispatchers.Default) {
            return@async Fib.takeIter(500000)
        }

        val indicatorJob = launch {
            while (true) {
                delay(100)
                print(".")
                if (job.isCompleted || job2.isCompleted) {
                    job.cancel()
                    job2.cancel()
                }
            }
        }

        try {
            withTimeout(1) {
                job2.await()
                job.await()
                indicatorJob.cancel()
            }
        } catch (e: CancellationException) {
            job2.cancel()
            job.cancel()
            indicatorJob.cancel()
            println("error")
        }

        launch {
            while (true) {
                delay(100)
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



