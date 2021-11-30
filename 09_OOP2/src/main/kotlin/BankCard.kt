import java.util.*

abstract class BankCard {

    abstract var balance: Float
    abstract fun balanceUp(cashInFlow: Float)
    abstract fun pay(paymentAmount: Float): Boolean
    abstract fun getBalance()
    abstract fun getAvailableMoney()

}

