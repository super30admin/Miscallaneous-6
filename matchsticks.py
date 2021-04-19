class Solution:
    
    """
    Description: Use all the matchsticks in a given array and identify if one can form a square
    
    Time Complexity: O(4^n)
    Space Complexity: O(1)
    
    Approach: Using backtracking
    1. for a given array one can simply identify if a square is possible or not
       - by checking if sum of all elements is divisible by 4
    2. create a list of length 4 (sqaure) to try stick lenghts in backtracking way:
       - for each element if the element in square are <= side length after adding element from the given array
       - backtrack if the combinations do not match to a square with equal sides (base condition)
       - loop through until we are out of all the trials
    """
    
    def makesquare(self, matchsticks: List[int]) -> bool:
        
        if matchsticks == None or len(matchsticks) == 0: 
            return False
        
        sSum = sum(matchsticks); side = sSum//4
        if sSum % 4 != 0: return False
        
        return self.backtrack(0, matchsticks, [0,0,0,0], side)
    
    def backtrack(self, idx, matchsticks, square, side):
        
        # base
        if idx == len(matchsticks):
            if all([val == side for val in square]): return True
            else: return False
        # logic
        for i in range(4):
            if square[i] + matchsticks[idx] <= side:
                square[i] += matchsticks[idx] 

                # recurse
                if self.backtrack(idx + 1, matchsticks, square, side): return True
                # backtrack
                square[i] -= matchsticks[idx]
        
        return False
