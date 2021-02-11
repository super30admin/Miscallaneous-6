"""
Time Complexity : O(nlogn) 
Space Complexity : O(1)  
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

In order to calculate the initial threshold, we will divide the desiredsum by total number. Now, in order to calculate the icreasing
threshold,we need to sort as the numbers lesser than the threshold are going to contribute to increase the threshold. So,
we start iterating through the array, when the value is less than threshold, we calculate how much value is saved and divide it 
by remaining number to calculate the total effect on new threshold.
"""


def threshold(Testcase, desiredSum):
    Testcase.sort()
    n = len(Testcase)
    initial = round(desiredSum/n, 2)
    for i in range(n):
        if Testcase[i] < initial:
            saved = initial-Testcase[i]
            increase = round(saved/(n-i-1), 2)
            initial = initial + increase
        else:
            break
    return initial


Testcase1 = [2, 1, 5]
desiredSum1 = 6
# output = 3
Testcase2 = [2, 1, 5]
desiredSum2 = 2
# output = 0.67
Testcase3 = [2, 1, 5]
desiredSum3 = 4
# output = 1.5
Testcase4 = [2, 1, 5]
desiredSum4 = 1
# output = 0.33
print(threshold(Testcase4, desiredSum4))
