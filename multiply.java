// Problem 311. Sparse Matrix Multiplication
// Time Complexity : O(mkn)
// Space Complexity : O(mn)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
class Solution {
    public int[][] multiply(int[][] mat1, int[][] mat2) {
        int m = mat1.length, k = mat1[0].length, n = mat2[0].length;
        int[][] result = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int p = 0; p < k; p++) {
                if (mat1[i][p] != 0) {
                    for (int j = 0; j < n; j++) {
                        if (mat2[p][j] != 0) {
                            result[i][j] += mat1[i][p] * mat2[p][j];
                        }
                    }
                }
            }
        }

        return result;
    }
}