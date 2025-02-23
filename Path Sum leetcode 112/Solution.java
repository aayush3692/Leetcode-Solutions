class Node{
    int data;
    Node left;
    Node right;

    public Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public boolean hasSum(Node root, int currSum, int targetSum){
        if (root == null){
            return false;
        }
        currSum += root.data;

        if(root.left == null && root.right == null){
            return currSum == targetSum;
        }

        return hasSum(root.left, currSum, targetSum) || hasSum(root.right, currSum, targetSum);
    }
    public boolean hasPathSum(Node root, int targetSum) {
        return hasSum(root, 0, targetSum);
        
    }
}