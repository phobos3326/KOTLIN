class CreditCard(var bal: Float) : BankCard() {

    private var creditBalance: Float = 100f

    var creditLimit: Float? = 100f

    override var balance: Float = bal
    //get() = bal
    /*set(bal) {
        field = bal
    }*/

    override fun balanceUp(cashInFlow: Float) {
        balance += cashInFlow
        println("карта пополнена на $cashInFlow")


    }

    override fun pay(paymentAmount: Float): Boolean {
        val delta = paymentAmount - balance
        if (delta >= 0) {
            println("оплата на сумму $paymentAmount. недостаточно средств будут использованы кредитные срадства  в размере $delta")
            balance -= paymentAmount - delta
            creditPay(delta)
            return false
        } else {
            balance -= paymentAmount
            println("оплата на сумму $paymentAmount")
            return true
        }
    }

    private fun creditPay(paymentAmount: Float) {

        if (creditBalance < paymentAmount) {
            println("недостаточно кредитных средств")
        } else {
            creditBalance -= paymentAmount
            println("произведена оплата кредитными средствами")
        }
    }

    fun delta(paymentAmount: Float): Float {
        return balance - creditBalance
    }

    override fun getBalance() {
        println("баланс карты $balance")
    }

    override fun getAvailableMoney() {
        println("собственные средства $balance")
        println("кредитный лимит $creditLimit")
        println("бланс кредита $creditBalance")

    }

    fun upPercent() {
        val a = balance / 100 * 1.5f
        balance += a
        println("начислены проценты в размере $a")
    }

}