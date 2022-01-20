class Stack<T> {

    var array = mutableListOf<T>();

    fun push(item: T) {
        array.add(item)
    }

    fun pop(): T? {
        return array.removeLastOrNull()
    }

    fun isEmpty(): Boolean {
        return array.isEmpty()
    }


}


