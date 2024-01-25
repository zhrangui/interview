package leetcode.find_first_and_last_position_of_element_in_sorted_array_34

import kotlin.test.Test
class SolutionTest {
    @Test fun searchRange() {
        val classUnderTest = Solution()
        val nums =  intArrayOf(5,7,7,8,8,10)
        val target = 8
        val result = classUnderTest.searchRange(nums, target)
        assert(result.contentEquals(intArrayOf(-1,-1)))
    }
}
