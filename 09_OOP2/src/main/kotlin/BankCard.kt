import java.util.*

abstract class BankCard(var balance: Int) {

    abstract fun balanceUp()
    abstract fun pay()
    abstract fun getBalance()

}

