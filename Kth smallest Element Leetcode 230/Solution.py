class Node:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None
        
class Solution:
    def kthSmallest(self, root: Node, k: int) -> int:
        count = [k]
        ans = [0]
        
        def dfs(root):
            if not root:
                return
            
            dfs(root.left)
            if count[0] == 1:
                ans[0] = root.data
                
            count[0] -= 1
            
            if count[0] > 0:
                dfs(root.right)
                
        dfs(root)
        return ans[0]