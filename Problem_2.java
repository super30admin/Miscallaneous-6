// Time Complexity : O(m*k*n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Take 4 pointers and modify the i2 and j1 for each values, and find the sum, set the value to the result then increse the y pointer for result and for the second matrix increase the x pointer, when the x pointer reaches at the end increse the x pointer of the first matrix and reset all the pointers.
// Your code here along with comments explaining your approach
class Solution {
    public int[][] multiply(int[][] mat1, int[][] mat2) {
        int m1 = mat1.length;
        int n1 = mat1[0].length;
        int m2 = mat2.length;
        int n2 = mat2[0].length;

        int i1 = 0; int j1 = 0;
        int i2 = 0; int j2 = 0;
        int p = 0; int q = 0;
        int [][] res = new int [m1][n2];
        while(i1 < m1 && j1 < n2){
            int sum = 0;
            while(j1 < n1 && i2 < m2){
                sum = sum + (mat1[i1][j1++]*mat2[i2++][j2]);
            }
            j1 = 0;
            i2 = 0;
            res[p][q] = sum;
            j2++;
            q++;
            if(j2 == n2){
                j2 = 0;
                q = 0;
                i1++;
                p++;
            }
        }
        return res;
    }
}
