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
    int max = 0;
    public int run(TreeNode root){
        if(root == null)return 0;
        if(root.left == null && root.right == null)return 1;
        int left = run(root.left);
        int right = run(root.right);
        max = Math.max(max, left + right + 1);
        return ((left > right)?left:right) + 1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        run(root);
        return (max > 0) ? max - 1 : 0;
    }
}
