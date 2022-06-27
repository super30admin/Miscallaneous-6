// Time Complexity : O(m * k * n) where m, n, k are dimensions of the input matrices
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Use the mathematical technique where we take sum of multiples of row values to column values
// This way we can generate the resultant value for each cell and store in result matrix
// Finally we can return the result.
class Solution {
    public int[][] multiply(int[][] mat1, int[][] mat2) {
        int[][] result = new int[mat1.length][mat2[0].length];
        for(int i = 0; i < mat1.length; i++){
            for(int j = 0; j < mat2[0].length; j++){
                result[i][j] = 0;
                for(int k = 0; k < mat2.length; k++){
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        return result;
    }
}