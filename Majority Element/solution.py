def findMajority(nums: list[int]) -> int:
    h = {}
    n = len(nums)
    
    for x in nums:
        h[x] = h.get(x, 0) +1
        
        if h[x] > n/2:
            return x
        
    return -1

print(findMajority([2,2,1,1,1,2]))