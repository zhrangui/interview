package leetcode.Merge_Sorted_Array_88

class Solution() {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): UInt {
        var j = 0
        var k = 0
        var nums = nums1.clone()
        for(i in 0..m+n-1) {
            if ( j < m && k < n && nums[j] <= nums2[k]) {
                nums1[i]=nums[j]
                j++;
            } else if (k < n){
                nums1[i] = nums2[k]
                k++
            } else {
                nums1[i]=nums[j]
                j++;
            }
        }
        return 0u
    }
}
