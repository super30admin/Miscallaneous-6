'''
Time Complexity: 0(n)
Space Complexity: 0(1)
'''
class Solution:
    def getSolution(self,nums,target):
        
        # sort the nums
        nums.sort()
        
        # find the currentTh
        currentTh = target/len(nums)
        
        # iterate the nums and cal the new threshold value dynamically
        for i in range(0,len(nums)):
            if nums[i] < currentTh:
                diff = currentTh-nums[i]
                thFact = diff/(len(nums)-i-1)
                currentTh += thFact
            else:
                nums[i] = currentTh
        '''end of for loop'''
        print('currentTh is:\t',currentTh)
        return currentTh

sol = Solution()
sol.getSolution([2,1,3,2,4],10)
