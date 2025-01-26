#Time Complexity: O(n)
#Space Complexity: O(1)
def findThreshold(nums,desiredsum):
    n = len(nums)
    threshold = desiredsum/n
    for i,num in enumerate(nums):
        if(num<threshold):
            difference = threshold - num
            threshold = threshold + (difference/(n-i-1))
    return threshold
