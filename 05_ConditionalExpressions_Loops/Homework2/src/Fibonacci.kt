fun main() {
    var n: Int

    do {
        println("input number >0")
        n = readLine()?.toIntOrNull() ?: return
    } while (n <= 0)
    println(fibo(n))
    var l = Long.MAX_VALUE
    println("Lon $l")

    println(fib(n))
}

/*fun fibo(number: Int): Int {
    return if (number <= 1) {
        0;
    } else if (number == 2) {
        1;
    } else  {
        fibo(number - 1) + fibo(number - 2);
    }




}*/

fun fibo(number: Int): Long {
    //val n = 10
    val arr = LongArray(number)
    arr[0] = 0
    arr[1] = 1
    for (i in 2 until arr.size) {
        arr[i] = arr[i - 1] + arr[i - 2]
        System.out.println(arr[i])
    }
    return arr.maxOf { it }.toLong()
}


fun fib(number: Int): Long {
    //val n = 10
    val arr = LongArray(number + 1)
    arr[0] = 0
    arr[1] = 1

    for (i in 2 until number)
        arr[i] = arr[i - 1] + arr[i - 2]
    return arr.maxOf { it }.toLong()

}


fun fi11b(number: Int): Long {



    //val n = 10
    val arr = LongArray(number + 1)
    arr[0] = 0
    arr[1] = 1

    for (i in 2 until number)
        arr[i] = arr[i - 1] + arr[i - 2]
    return arr.maxOf { it }.toLong()

}

