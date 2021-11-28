class DebitCard(balance: Float) : BankCard(balance) {

    override fun toString(): String {
        return balance.toString()
    }

    override fun balanceUp() {
        val a = (1..100).random()
        balance += a
        println("карта пополнена на $a")

    }

    override fun pay() {
        val b = (1..100).random()

        if (balance < b) {
            println("недостаточно средств")
        } else {
            balance -= b
            println("оплата на сумму $b")
        }
    }

    override fun getBalance() {
        println("баланс карты $balance")
    }

    fun upPercent() {
        /* balance += 1
         println("начислены проценты, баланс $balance")*/
        //var a = balance
        balance += (balance / 100 * 1.5).toFloat()
    }


}