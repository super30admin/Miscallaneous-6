class Solution:
  
    """
    Description: Get threshold to get the target sum with codition that a number in given array is either lower than or equals to the threshold
    
    Time Complexity: O(n log n) 
    Space Complexity: O(1)
    
    Approach:
    - start with threshold = targetSum / number of elements in array
    - sort the array (to not miss a number which is shorter than continuously updating threshold in the loop)
    - for each number lower than the current threshold, update the threshold by evenly distributing the remaining balance for rest of the numbers
    """
    
    def getThreshold(self, nums, target):
        
        n = len(nums); thresh = target/n
        nums = sorted(nums)

        for i in range(n):
            if nums[i] < thresh:
                # update threshold
                diff = thresh - nums[i]
                # distribute in remaining numbers
                thresh = thresh + diff/(n - 1 - i)
                
        return thresh
    
s = Solution()
print(s.getThreshold([2,1,2,3,6], 10))
print(s.getThreshold([2,1,5], 4))
