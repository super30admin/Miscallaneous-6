//Method 1
class Solution {

    //Time Complexity: 0(m*p*n) where m is the no of rows in matrix mat1, n is the columns in matrix mat1 and p is the no. of columns in matrix mat2

    public int[][] multiply(int[][] mat1, int[][] mat2) {
        if(mat1 == null || mat2 == null){
            return new int[][]{};
        }

        int m = mat1.length;    //getting length of row and column of mat1
        int n = mat1[0].length;
        int p = mat2[0].length; //getting length of column of mat2
        int[][] c = new int [m][p]; //the final matrix after multiplication of (m*n) * (o*p) would be of size m*p

        for(int i = 0; i < m; i++){
            for(int j = 0; j < p; j++){
                for(int k = 0; k < n; k++){
                    c[i][j] += mat1[i][k] * mat2[k][j]; //multiplying row wise
                }
            }
        }

        return c;

    }
}

//Optimization

//Time Complexity : 0(m*n*p)    //Time remains same asymptotically but since it's a sparse matrix, mat1 will contain a lot of 0's so I wont be looping inside the inner loop when mat1 = 0 as everything will be 0 for that row
//Space Complexity: 0(1)

class Solution {
    public int[][] multiply(int[][] mat1, int[][] mat2) {
        if(mat1 == null || mat2 == null){
            return new int[][]{};
        }

        int m = mat1.length;
        int n = mat1[0].length;
        int p = mat2[0].length;
        int[][] c = new int [m][p];

        for(int i = 0; i < m; i++){
            for(int k = 0; k < n; k++){ //I interchange the innermost loop and the middle loop
                if(mat1[i][k] != 0){
                    for(int j = 0; j < p; j++){
                        c[i][j] += mat1[i][k] * mat2[k][j];
                    }
                }
            }
        }

        return c;

    }
}