class Solution:
    def longestCommonPrefix(self, strs: list[str]) -> str:
        min_length = float('inf')
        
        for s in strs:
            if len(s) < min_length:
                min_length = len(s)
                
        i = 0
        while i < min_length:
            for s in strs:
                if s[i] != strs[0][i]:
                    return s[:i]
                
            i += 1
        return strs[0][:i]
    
sol = Solution()
q = ["flower","flow","flight"]
print(sol.longestCommonPrefix(q))
print(sol.longestCommonPrefix(["dog","racecar","car"]))