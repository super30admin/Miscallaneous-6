// Time Complexity : O(mnp)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public int[][] multiply(int[][] mat1, int[][] mat2) {
        if(mat1 == null || mat2 == null) {
            return new int[0][0];
        }
        
        int m = mat1.length;
        int n = mat1[0].length;
        int p = mat2[0].length;
        int[][] result = new int[m][p];
        
        for(int i = 0; i < m; i++) {
            for(int k = 0; k < n; k++) {
                for(int j = 0; j < p; j++) {
                    if(mat1[i][k] != 0) {
                        result[i][j] += mat1[i][k] * mat2[k][j];
                    }
                }
            }
        }
        
        return result;
    }
}