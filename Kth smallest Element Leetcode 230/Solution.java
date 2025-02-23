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
    private int count;
    private int ans;

    public void dfs(Node root){
        if (root == null){
            return;
        }
        dfs(root.left);
        if (count == 1){
            ans = root.data;
        }
        count -= 1;
        if (count > 0){
            dfs(root.right);
        }
    }
    public int kthSmallestElement(Node root, int k){
        count = k;
        ans = 0;
        dfs(root);
        return ans;
    }
}