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
    public TreeNode helper(TreeNode root, int node){
        if(root == null){
            root = new TreeNode(node);
            return root;
        }
        if(root.val > node){
            root.left = helper(root.left, node);
        }
        if(root.val < node){
            root.right = helper(root.right, node);
        }
        return root;
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        // TreeNode node = new TreeNode(val);
        if(root == null){
            return new TreeNode(val);
        }
        helper(root, val);
        return root;
    }
}