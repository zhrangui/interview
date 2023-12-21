package leetcode.merge_sorted_array_88

class Solution{
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        var j = 0
        var k = 0
        val nums = nums1.clone()
        for(i in 0..<m+n) {
            if ( j < m && k < n && nums[j] <= nums2[k]) {
                nums1[i]=nums[j]
                j++
            } else if (k < n){
                nums1[i] = nums2[k]
                k++
            } else {
                nums1[i]=nums[j]
                j++
            }
        }
    }
}
