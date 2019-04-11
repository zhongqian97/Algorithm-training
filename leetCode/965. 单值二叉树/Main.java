class Solution {
    public boolean run(TreeNode root,int a){
        if(root == null)return true;
        if(root.val != a)return false;
        if(run(root.left,a) && run(root.right,a))return true;
        return false;
    }
    public boolean isUnivalTree(TreeNode root) {
        if(root == null)return true;
        return run(root,root.val);
    }
}
