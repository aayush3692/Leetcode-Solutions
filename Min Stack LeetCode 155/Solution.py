class MinStack:
    def __init__(self):
        self.stack = []
        self.min_stack = []
        
    def push(self, val:int) -> None:
        self.stack.append(val)
        
        if not self.min_stack:
            self.min_stack.append(val)
        elif self.min_stack[-1] < val:
            self.min_stack.append(self.min_stack)
        else:
            self.min_stack.append(val)
            
    def pop(self) -> None:
        self.stack.pop()
        self.min_stack.pop()
    def top(self) -> int:
        return self.stack[-1]
    
    def getMin(self) -> int:
        return self.min_stack[-1]
    
    
obj = MinStack()
obj.push(4)
obj.pop()

obj.push(2)
obj.push(5)
print(obj.top())
print(obj.getMin())


    