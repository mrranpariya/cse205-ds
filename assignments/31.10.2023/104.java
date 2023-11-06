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
    
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> a = new LinkedList<>();
        a.add(root);
        while(a.isEmpty()==false){
            List<Integer> list = new ArrayList<>();
            int n = a.size();
            for(int i=0; i<n; i++){
                if(a.peek().left != null){
                    a.add(a.peek().left);
                }
                if(a.peek().right != null){
                    a.add(a.peek().right);
                }
                list.add(a.remove().val);
            }
            ans.add(list);
        }
        return ans.size();
    }
}