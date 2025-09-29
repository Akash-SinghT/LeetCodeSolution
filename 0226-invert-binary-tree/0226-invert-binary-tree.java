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
    public TreeNode invertTree(TreeNode root) {
        if(root==null)return root;
        inverTree(root);
        return root;
    }
    public void inverTree(TreeNode node){
        if(node==null)return;
        TreeNode leftside=invertTree(node.left);
        TreeNode rightside=invertTree(node.right);
        node.left=rightside;
        node.right=leftside;
    }
}