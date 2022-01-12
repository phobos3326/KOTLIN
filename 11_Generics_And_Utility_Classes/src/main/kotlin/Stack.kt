class Stack<T> {

    var array = mutableListOf<T>();

    fun push(item: T) {
        array.add(item)
    }

    fun pop(): T? {
                val number = array.lastIndex
        return if (array.isEmpty()){
            println("Stack empty")
            null
        }else{
            array.removeAt(number)
        }

    }

    fun isEmpty(): Boolean {
        return array.isEmpty()
    }


}


