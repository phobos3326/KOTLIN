import java.util.*

abstract class BankCard(var balance: Float) {

    abstract fun balanceUp()
    abstract fun pay()
    abstract fun getBalance()

}

