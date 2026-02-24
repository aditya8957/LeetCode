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
    public int find(TreeNode root, int v){
        if(root == null) return 0;

        v = (2*v)+(1*root.val);

        if(root.left == null && root.right == null) return v;

        return find(root.left,v)+find(root.right,v);
    }
    public int sumRootToLeaf(TreeNode root) {
        return find(root,0);
    }
}