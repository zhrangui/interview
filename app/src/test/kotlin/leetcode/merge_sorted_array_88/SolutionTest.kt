package leetcode.merge_sorted_array_88

import kotlin.test.Test

class SolutionTest {
    @Test fun mergeToOne() {
        val classUnderTest = Solution()
        val num1 =  intArrayOf(1,2,3,0,0,0)
        val num2 = intArrayOf(2,5,6)
        classUnderTest.merge(num1, 3, num2, 3)
        assert(num1.contentEquals(intArrayOf(1,2,2,3,5,6)))
    }
}