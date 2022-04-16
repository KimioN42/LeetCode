/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public TreeNode convertBST(TreeNode root) {
        dfs(root, 0);
        return root;
    }

    // gets sum of right subtree using depth first search
    private int dfs(TreeNode root, int sum) {
        if (root == null)
            return sum;
        root.val += dfs(root.right, sum);
        return dfs(root.left, root.val);
    }

    public static void main(String[] args) {
        System.out.println("Hello world");
    }
}