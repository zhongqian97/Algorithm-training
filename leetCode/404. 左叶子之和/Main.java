/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int run(TreeNode root,boolean ifLeft){
        if(root == null)return 0;
        if(root.left == null && root.right == null && ifLeft)return root.val;
        int sum = run(root.left, true);
        sum += run(root.right, false);
        return sum;
    }
    public int sumOfLeftLeaves(TreeNode root) {
        return (root != null)?run(root.left, true) + run(root.right, false):0;
    }
}
