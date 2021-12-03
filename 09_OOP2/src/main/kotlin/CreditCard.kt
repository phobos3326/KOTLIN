class CreditCard(val bal: Float) : BankCard() {

    var creditBalance: Float? = 50f

    var creditLimit: Float? = 50f

    override var balance: Float = 0.0f
        get() = field
        set(bal) {
            field = bal
        }

    override fun balanceUp(cashInFlow: Float) {
        balance += cashInFlow
        println("карта пополнена на $cashInFlow")



    }

    override fun pay(paymentAmount: Float): Boolean {
        if (balance < paymentAmount) {
            println("оплата на сумму $paymentAmount. недостаточно средств будут использованы кредитные срадства")
            creditBalance = creditBalance?.minus(paymentAmount)
            return false
        } else {
            balance -= paymentAmount
            println("оплата на сумму $paymentAmount")
            return true
        }
    }

    override fun getBalance() {
        println("баланс карты $balance")
    }

    override fun getAvailableMoney() {
        println("кредитный лимит $creditLimit")
        println("бланс кредита $creditBalance")
    }

    fun upPercent() {
        val a = balance / 100 * 1.5f
        balance += a
        println("начислены проценты в размере $a")
    }

}