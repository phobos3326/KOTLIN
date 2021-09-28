fun main() {
    var n:Int

    do {
        println("input number >0")
         n = readLine()?.toIntOrNull()?:return
    }while (n<=0)
   println(fibo(n))
   println(Int.MAX_VALUE)
}

fun fibo(number: Int): Int {


    return if (number <= 1) 0 else if (number == 2) 1 else fibo(number - 1) + fibo(number - 2)

}