/*
Sparse Matrix Multiplication
approach: we can do a brute force, but if we observe, when the value in first matrix is 0 then there is no point in multiplying
that with the number from second matrix, so we can skip those
time: O(A's row * B's column * A's column (which is the same as B's row))
space: O(1)
 */
public class Problem2 {
    public int[][] multiply(int[][] mat1, int[][] mat2) {
        int r1 = mat1.length, c1 = mat1[0].length, c2 = mat2[0].length;
        int[][] res = new int[r1][c2];

        for (int i=0;i<r1;i++) {
            for (int j=0;j<c1;j++) {
                if (mat1[i][j]!=0) {
                    for (int k=0;k<c2;k++) {
                        res[i][k] += mat1[i][j]*mat2[j][k];
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Problem2 problem2 = new Problem2();
        problem2.multiply(new int[][]{{1,0,0},{-1,0,3}}, new int[][]{{7,0,0},{0,0,0},{0,0,1}});
    }
}
