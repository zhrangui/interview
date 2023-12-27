package leetcode.min_stack_155

class  MinStack{
    private val stack:ArrayDeque<Int> = ArrayDeque()
    private val minStack:ArrayDeque<Int> = ArrayDeque()

    fun push(`val`: Int) {
        stack.add(`val`)
        if (minStack.isEmpty()) {
            minStack.add(`val`)
        } else {
            val last = minStack.last()
            if (`val` < last) minStack.add(`val`) else minStack.add(last)
        }
    }

    fun pop(): Int? {
        if (stack.isEmpty()) {
            return null
        }
        stack.removeLast()
        return minStack.removeLast()
    }

    fun top(): Int {
       return stack.last()
    }

    fun getMin(): Int {
        return minStack.last()
    }
}
