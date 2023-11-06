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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }

        boolean s = false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(queue.isEmpty()==false){
            List<Integer> list = new ArrayList<>();
            int num = queue.size();
            for(int i=0; i<num; i++){
                if(queue.peek().left!=null) queue.add(queue.peek().left);
                if(queue.peek().right!=null) queue.add(queue.peek().right);
                list.add(queue.remove().val);
            }
            
            if(s == false){
                ans.add(list);
                s = true;
            }
            else{
                List<Integer> temp = new ArrayList<>();
                for(int i=0; i<list.size(); i++){
                    temp.add(list.get(list.size()-1-i));
                }
                ans.add(temp);
                s = false;
            }
        }
        return ans;
    }
}