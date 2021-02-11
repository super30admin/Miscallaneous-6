"""
Time Complexity : O(mkn)
Space Complexity : O(1)  
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

It is a normal matrix multiplication method.
"""


class Solution:
    def multiply(self, A: List[List[int]], B: List[List[int]]) -> List[List[int]]:
        m, l, n = len(A), len(B), len(B[0])
        result = [[0]*n for _ in range(m)]
        for i in range(m):
            for k in range(l):
                if A[i][k]:
                    for j in range(n):
                        result[i][j] += A[i][k] * B[k][j]
        return result
