package leetcode.min_stack_155

import kotlin.test.Test

class MinStackTest {
    @Test
    fun getMin() {
        val minStack = MinStack()
        minStack.push(-2)
        minStack.push(0)
        minStack.push(-3)
        assert(minStack.getMin() == -3)

        minStack.pop()
        assert(minStack.top() == 0)
        assert(minStack.getMin() == -2)
    }
}
