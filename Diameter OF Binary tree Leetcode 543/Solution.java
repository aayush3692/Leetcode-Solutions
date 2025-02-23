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

public class Solution{
    public int height(Node root){
        if (root == null){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        return 1+Math.max(left, right);
    }
    public int diameterOfBinaryTree(Node root){
        int max_diameter = 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int diameter = leftHeight + rightHeight;

        max_diameter = Math.max(max_diameter, diameter);

        return max_diameter;
    }
}