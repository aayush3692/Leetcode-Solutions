from math import ceil, floor
class Solution:
    def evalRPN(self, tokens):
        stack = []
        for t in tokens:
            if t in '+-*/':
                b, a = stack.pop(), stack.pop()
                if t == '+':
                    stack.append(a+b)
                if t == '-':
                    stack.append(a-b)
                if t == '*':
                    stack.append(a*b)
                else:
                    div = a / b
                    if (div < 0):
                        stack.append(ceil(div))
                    else:
                        stack.append(floor(div))
            else:
                stack.append(int(t))
                
        return stack[0]
    
sol = Solution()
tokens = ["2","1","+","3","*"]
value = sol.evalRPN(tokens)
print(value)
                    

