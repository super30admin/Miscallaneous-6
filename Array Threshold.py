class Solution:
    def arrayThreshold(self, nums, desiredSum):
        #Approach: One-pass
        #Time Complexity: O(n)
        #Space Complexity: O(1)
        
        if sum(nums) < desiredSum:
            return -1
        
        nums.sort()
        n = len(nums)
        
        thresh = desiredSum / n             # best case
        for i in range(len(nums)):
            if nums[i] >= thresh:           # all remaining nums are greater than thresh
                break
            
            diff = thresh - nums[i]
            thresh += diff / (n - i - 1)    # distribute diff among the remaining nums
            
        return thresh
    
#Driver code
sol = Solution()
print(sol.arrayThreshold([2, 1, 5], 6))
print(sol.arrayThreshold([2, 1, 5], 2))
print(sol.arrayThreshold([2, 1, 5], 4))
print(sol.arrayThreshold([2, 1, 5], 1))
print(sol.arrayThreshold([2, 1, 5], 8))
print(sol.arrayThreshold([2, 1, 5], 9))
print('\n')
print(sol.arrayThreshold([5, 10, 4, 3, 9, 1], 9))
print(sol.arrayThreshold([5, 10, 4, 3, 9, 1], 33))
print(sol.arrayThreshold([5, 10, 4, 3, 9, 1], 25))
print(sol.arrayThreshold([5, 10, 4, 3, 9, 1], 16))
print(sol.arrayThreshold([5, 10, 4, 3, 9, 1], 22))
print(sol.arrayThreshold([5, 10, 4, 3, 9, 1], 6))