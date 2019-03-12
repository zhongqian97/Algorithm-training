class Solution {
    public TreeNode run(TreeNode root,TreeNode x){
        if(root.val > x.val){
            return root.left;
        }else{
            return root.right;
        }
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode pp = null;
        TreeNode qq = null;
        while(root != null){
            if(root.val == p.val || root.val == q.val){
                return root;
            }
            pp = run(root,p);
            qq = run(root,q);
            if(pp != qq){
                return root;
            }
            root = pp;
        }
        return null;
    }
}