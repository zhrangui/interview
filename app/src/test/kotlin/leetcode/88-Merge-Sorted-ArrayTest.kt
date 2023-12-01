package leetcode

import kotlin.test.Test
import kotlin.test.assertNotNull

class SolutionTest {
    @Test fun appHasAGreeting() {
        val classUnderTest = Solution()
        assertNotNull(classUnderTest.merge(IntArray(1), 0, IntArray(1), 0), "two arrays should merge")
    }
}