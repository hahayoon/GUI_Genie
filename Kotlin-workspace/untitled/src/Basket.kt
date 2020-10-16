class Basket {
    val list = ArrayList<Int>()

    fun addNum(a: Int) {
        list.add(a)
    }

    //    fun getSize() = list.size
    fun getSize(): Int {
        return list.size
    }

    inner class BasketIterator : Iterator<Int> {
        var currIdx = -1

        override fun hasNext(): Boolean {

            return false
        }

        override fun next(): Int {
            return 0
        }

    }

}