import java.util.*

abstract class BankCard {

    open var balance: Float = 0.0f
    abstract fun balanceUp(cashInFlow: Float)
    abstract fun pay(paymentAmount: Float): Boolean
    abstract fun getBalance()
    abstract fun getAvailableMoney()

}

