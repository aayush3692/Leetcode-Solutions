class Node:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
class Solution:
    def isSymmetric(self, root: Node) -> bool:
        if not root:
            return False
        
        def isMirror(leftRoot, rightRoot) -> bool:
            if not leftRoot and not rightRoot:
                return True
            if not leftRoot or not rightRoot or leftRoot.val != rightRoot.val:
                return False
            
            return isMirror(leftRoot.left, rightRoot.right) and isMirror(leftRoot.right, rightRoot.left)
        
        
        return isMirror(root.left, root.right)