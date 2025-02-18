class Solution:
    def findClosestNumber(self, nums: list[int]) -> int:
        closest = nums[0]
        for x in nums:
            if (abs(x) < abs(closest)):
                closest = x
                
        if closest < 0 and abs(closest) in nums:
            return abs(closest)
        else:
            return closest
        
sol = Solution()
nums = [-4,-2,-1,4,8]
print(sol.findClosestNumber(nums))