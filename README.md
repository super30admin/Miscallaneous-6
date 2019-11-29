# Hashing-4
## Problem 1: Multiplication in a spiral matrix (https://leetcode.com/problems/sparse-matrix-multiplication/)

Provided two sparse matrices A and B, return the result of AB.



Example:

Input:


A = [

  [ 1, 0, 0],

  [-1, 0, 3]

]

B = [

  [ 7, 0, 0 ],

  [ 0, 0, 0 ],

  [ 0, 0, 1 ]

]

Output:


     |  1 0 0 |   | 7 0 0 |   |  7 0 0 |
AB = | -1 0 3 | x | 0 0 0 | = | -7 0 3 |

                  | 0 0 1 |
