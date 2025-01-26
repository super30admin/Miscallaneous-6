#Time Complexity : O(N*P*M) i.e, where N is no.of rows in matrix1, P is no.of columns in matrix1 or no.of rows in matrix2, M in the no.of columns in matrix2
#Space Complexity : O(M*N) i.e , new matrix formed from (M*M) and (N*N)
class Solution:
    def multiply(self, mat1: List[List[int]], mat2: List[List[int]]) -> List[List[int]]:
        m = len(mat1)
        n = len(mat2[0])
        result = [[0 for _ in range(n)] for _ in range(m)]
        for i in range(m):
            row = mat1[i]
            for k in range(len(row)):
                if(mat1[i][k]==0):
                    continue
                for j in range(n):
                    result[i][j] += row[k]*mat2[k][j]
        return result



        