/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class BSTIterator {
    private LinkedList<Integer> l;
    private int flag;
    public void run(TreeNode root) {
        if(root == null)return;
        run(root.left);
        l.add(root.val);
        run(root.right);
    }
    public BSTIterator(TreeNode root) {
        l = new LinkedList<Integer>();   
        run(root);
        flag = 0;
    }
    
    /** @return the next smallest number */
    public int next() {
        return l.get(flag++);
    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        if(l.size() > flag)return true;
        else return false;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
