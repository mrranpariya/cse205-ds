class BSTIterator {
    
    ArrayList<TreeNode> arr = new ArrayList<>();
    int k =0;
    public BSTIterator(TreeNode root) {
        inorder(root);
    }
    
    public void inorder(TreeNode root){
        if(root==null)
               return;
        inorder(root.left);
        arr.add(root);
        inorder(root.right);
    }
    
    public int next() {
         return arr.get(k++).val;
    }
    
    public boolean hasNext() {
        return k<arr.size();
    }
}