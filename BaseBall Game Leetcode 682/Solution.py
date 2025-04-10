class Solution:
    def calPoints(self, operations):
        stack = []
        for op in operations:
            if op == '+':
                stack.append(stack[-1]+stack[-2])
            elif op == 'D':
                stack.append(stack[-1]*2)
            elif op == 'C':
                stack.pop()
            else:
                stack.append(int(op))
        return sum(stack)
    
sol = Solution()
ops = ["5","2","C","D","+"]
print(sol.calPoints(ops))
    