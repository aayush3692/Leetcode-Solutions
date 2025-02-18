class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        n = len(nums)
        for i in range(n):
            for j in range(i+1, n):
                if nums[i] + nums[j] == target:
                    return (i,j)
    #time : O(n^2)
    #space :O(1)
    
    def twoSum1(self, nums: list[int], target: int) -> list[int]:
        seen = {}
        for i in range(len(nums)):
            seen[nums[i]] = i
            
        for i in range(len(nums)):
            y = target - nums[i]
            
            if y in seen and seen[y] != i:
                return [i, seen[y]]
        #time: O(n)
        #space: O(n)
        
    #optimal solution
    def twoSum2(self, nums: list[int], target: int) -> list[int]:
        seen = {}
        for i, x in enumerate(nums):
            y = target - x
            if y in seen:
                return [i, seen[y]]
            else:
                seen[x] = i