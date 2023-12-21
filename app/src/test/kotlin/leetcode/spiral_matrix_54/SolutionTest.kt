package leetcode.spiral_matrix_54

import kotlin.test.Test

class SolutionTest {
    @Test fun orderToList() {
        val classUnderTest = Solution()
        val matrix = arrayOf(intArrayOf(1,2,3,4), intArrayOf(5,6,7,8), intArrayOf(9,10,11,12))
        val actual = listOf(1,2,3,4,8,12,11,10,9,5,6,7)
        val result = classUnderTest.spiralOrder(matrix)
        println(message = result)
        assert(actual == result)
    }
}