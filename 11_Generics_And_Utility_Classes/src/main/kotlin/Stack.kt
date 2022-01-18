class Stack<T> {

    var array = mutableListOf<T>();

    fun push(item: T) {
        array.add(item)
    }

    fun pop(): T? {
        return if (array.isEmpty()) {
            println("Stack empty")
            null
        } else {
            array.removeAt(array.lastIndex)
        }

    }

    fun isEmpty(): Boolean {
        return array.isEmpty()
    }


}


