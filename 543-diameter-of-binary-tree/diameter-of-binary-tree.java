/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int height(TreeNode root){
        if(root == null) return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;

        int op1 = diameterOfBinaryTree(root.left);
        int op2 = diameterOfBinaryTree(root.right);

        int leftht = height(root.left);
        int rightHt = height(root.right);

        int op3 = leftht + rightHt;

        return Math.max(op3, Math.max(op1, op2));
    }
}
