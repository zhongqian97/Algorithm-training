class Solution {
    private int maxVal = 0;
    public int longestUnivaluePath(TreeNode root) {
        if(root == null)return 0;
        this.dfs(root, root.val);
        return this.maxVal;
    }
    private int dfs(TreeNode node, int prevVal){
        if (node == null){
            return 0;
        }
        int left = this.dfs(node.left, node.val);
        int right = this.dfs(node.right, node.val);
        this.maxVal = Math.max(this.maxVal, left + right);
        if (node.val == prevVal){
            return Math.max(left, right) + 1;
        }
        return  0;
    }
}
