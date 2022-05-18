import kotlinx.coroutines.currentCoroutineContext
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.isActive


object Bag {

    val getLottoFlow = flow {
        while (currentCoroutineContext().isActive) {
            val lotto = (1..90).toMutableList()
            lotto.shuffle()
            for (i in 0..89) {
                emit(lotto[i])
                delay(10)
            }

        }

    }


}
