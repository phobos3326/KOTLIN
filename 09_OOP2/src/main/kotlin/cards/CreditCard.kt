package cards

import BankCard

class CreditCard(bal: Float) : BankCard() {

    private var creditBalance: Float = 100f

    var creditLimit: Float = 100f

    override var balance: Float = bal

       override fun balanceUp(cashInFlow: Float) {
        val delta = creditLimit-creditBalance
        if (delta>0){
            println("пополнение карты на сумму $cashInFlow, вначале нужно погасить кредитую часть на сумму $delta")
            creditBalance+= delta
            balance+=cashInFlow-delta
        }else{
            balance += cashInFlow
            println("карта пополнена на $cashInFlow")
        }

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