// Time Complexity: O(m*n*p)
// Space Complexity: O(1)
class Solution {
    public int[][] multiply(int[][] mat1, int[][] mat2) {
        if(mat1 == null && mat2 == null) return new int[][]{};

        int m = mat1.length; // num of rwos in mat1
        int n = mat1[0].length; // num of cols in mat1
        int p = mat2[0].length; // numb of cols in mat

        int[][] mat3 = new int[m][p];

        for (int i=0; i < m; i++) {
            for(int k=0; k < n; k++) {
                if(mat1[i][k] != 0) {
                    for (int j=0; j < p; j++) {
                        mat3[i][j] += mat1[i][k] * mat2[k][j];
                    }
                }
            }
        }

        return mat3;
    }
}