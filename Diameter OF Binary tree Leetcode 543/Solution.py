class Node:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
        
class Solution:
    def height(self, root: Node) -> int:
        if root is None: return 0
        
        left = self.height(root.left)
        right = self.height(root.right)
        
        return max(left, right) + 1
    
    def diameterOfBinaryTree(self, root: Node) -> int:
        if root is None:
            return 0
        
        left = self.diameterOfBinaryTree(root.left)
        right = self.diameterOfBinaryTree(root.right)
        diameter3 = self.height(root.left) + self.height(root.right)

        return max(diameter3, max(left, right))
        
def diameter(self, root: Node) -> int:
    largest_diameter=[0]
    
    def height(root):
        if root is None:
            return 0
        
        left_height = height(root.left)
        right_height = height(root.right)
        diameter = left_height+right_height
        
        largest_diameter[0] = max(largest_diameter[0], diameter)
        
        return left_height+right_height+1
    
    root(height)
    return largest_diameter[0]
        
        