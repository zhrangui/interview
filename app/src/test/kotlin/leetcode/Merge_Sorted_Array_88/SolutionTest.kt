package leetcode.Merge_Sorted_Array_88

import kotlin.test.Test
import kotlin.test.assertNotNull

class SolutionTest {
    @Test fun mergeToOne() {
        val classUnderTest = Solution()
        var num1 =  intArrayOf(1,2,3,0,0,0);
        var num2 = intArrayOf(2,5,6);
        classUnderTest.merge(num1, 3, num2, 3)
        assertNotNull(num1 == intArrayOf(1,2,3,3,5,6))
    }
}