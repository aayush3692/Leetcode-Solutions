class Node:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None
        
class Solution:
    def hasPathSum(self, root: Node, targetSum: int)-> bool:
        
        def has_sum(root, currSum):
            if not root:
                return False
            
            currSum += root.data
            
            if not root.left and not root.right:
                return currSum == targetSum
            
            return has_sum(root.left, currSum) or has_sum(root.right, currSum)
        
        return has_sum(root, 0)