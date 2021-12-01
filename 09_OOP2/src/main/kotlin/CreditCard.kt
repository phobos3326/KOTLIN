class CreditCard: BankCard() {

    var creditLimit: Float? = null

    override fun balanceUp(cashInFlow: Float) {
        balance += cashInFlow
        println("карта пополнена на $cashInFlow")
    }

    override fun pay(paymentAmount: Float): Boolean {
        if (balance < paymentAmount) {
            println("недостаточно средств")
        } else {
            balance -= paymentAmount
            println("оплата на сумму $paymentAmount")
        }
        return true
    }

    override fun getBalance() {
        println("баланс карты $balance")
    }

    override fun getAvailableMoney() {
        TODO("Not yet implemented")
    }


}