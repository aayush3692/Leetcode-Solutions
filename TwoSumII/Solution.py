class Solution:
    def twoSum(self, numbers: list[int], target: int) -> list[int]:
        left = 0
        n = len(numbers)
        right = n -1

        while left < right:
            sum = numbers[left]+numbers[right]
            if sum == target:
                return [left+1, right+1]
            elif sum < target:
                left += 1
            else: 
                right -= 1

sol = Solution()
print(sol.twoSum([2,7,9,15], 9))