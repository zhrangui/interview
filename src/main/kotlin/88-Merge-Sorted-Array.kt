import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Solution() {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): UInt {
        return (nums1.size + m + nums2.size + n).toUInt();
    }

    @Test
    fun testMerge() {
        val nums1 = intArrayOf(1,2,3,0,0,0)
        val m = 3
        val nums2 = intArrayOf(2,5,6)
        val n = 3
        val expected = intArrayOf(1,2,2,3,5,6)
        assertEquals(expected, merge(nums1, m, nums2, n))
    }
}
