#brute force method

class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        s = set(jewels) 
        count = 0
        for stone in stones:
            if stone in s:
                count += 1
                
        return count
#set

#


    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
            for letter in ransomNote:
                if letter in magazine:
                    position = magazine.index(letter)
                    magazine = magazine[:position] + magazine[position+1:]
                else:
                    return False

            return True
so = Solution()
print(so.numJewelsInStones("aA", "aAAbbb"))
print(so.canConstruct("aa", "aab"))