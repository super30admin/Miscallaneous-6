// Time Complexity : O(m * n * p)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : NA


// Your code here along with comments explaining your approach

class Solution {
    public int[][] multiply(int[][] mat1, int[][] mat2) {
        
        int m = mat1.length;
        int n = mat2.length;
        int p = mat2[0].length;
        
        int[][] result = new int[m][p];
        
        for(int i = 0; i < m; i++) {
            for(int k = 0; k < n; k++) {
                if(mat1[i][k] == 0) continue;
                for(int j = 0; j < p; j++) {
                    if(mat2[k][j] == 0) continue;
                    result[i][j] += mat1[i][k] * mat2[k][j]; 
                }
            }
        }
        return result;
    }
}