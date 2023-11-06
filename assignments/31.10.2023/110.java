public class Solution { 
    public boolean isBalanced(TreeNode root) {
        if(root == null) 
            return true;
        if(root.left == null && root.right == null) return true;
        if(root.left == null || root.right == null) return false;

        return isBalanced(root.left) && isBalanced(root.right);
    }
}