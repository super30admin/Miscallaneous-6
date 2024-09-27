// LC 311
public class SpiralMatrixMultiplication {

    /**
     * Matrix multiplication is possible when
     * 2 matrices have the following dimensions:
     * <p>
     * matrix_1 = p * q
     * matrix_2 = q * r
     * <p>
     * So, instead of having 4 loops, we will have 3 loops:
     * <p>
     * for(rows of matrix_1 --> p) {
     * for(columns of matrix_1 --> q) {
     * for(columns of matrix_2 --> r) {
     * // NOTE: columns of matrix_1 == rows of matrix_2
     * }
     * }
     * }
     *
     * @param mat1
     * @param mat2
     * @return
     */
    public int[][] multiply(int[][] mat1, int[][] mat2) {
        int p = mat1.length;
        int q = mat1[0].length;
        int r = mat2[0].length;
        int[][] result = new int[p][r];
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                /*
                An optimisation: if mat1[i][j] == 0, no need to scan mat2[][]
                as product will be 0;
                 */
                if (mat1[i][j] == 0) {
                    continue;
                }
                for (int k = 0; k < r; k++) {
                    result[i][k] += mat1[i][j] * mat2[j][k];
                }
            }
        }
        return result;
    }
}
