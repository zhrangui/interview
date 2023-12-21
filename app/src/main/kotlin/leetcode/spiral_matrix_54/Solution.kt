package leetcode.spiral_matrix_54

class Solution {
    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        var m = matrix.size-1
        var n = matrix[0].size-1
        var i = 0
        var j = 0
        val mat = mutableListOf<Int>()
        while (i <= m && j <= n) {
            for (k in j..n) {
                mat.add(matrix[i][k])
            }
            for (k in i+1..m) {
                mat.add(matrix[k][n])
            }
            if (i < m) {
                for (k in n - 1 downTo j) {
                    mat.add(matrix[m][k])
                }
            }
            if (j<n) {
                for (k in m - 1 downTo i + 1) {
                    mat.add(matrix[k][i])
                }
            }
            ++i
            --m
            ++j
            --n
        }
        return mat
    }
}
