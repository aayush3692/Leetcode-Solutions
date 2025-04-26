class Solution:
    def productExceptSelf(self, nums: list[int]) -> list[int]:
        n = len(nums)
        answer = [0]*n

        L = 1
        leftArr = [0]*n
        for i in range(n):
            leftArr[i] = L
            L *= nums[i]

        R = 1
        rightArr=[0]*n
        for i in range(n-1, -1, -1):
            rightArr[i] = R
            R *= nums[i]

        for i in range (n):
            answer[i] = rightArr[i] * leftArr[i]

        return answer