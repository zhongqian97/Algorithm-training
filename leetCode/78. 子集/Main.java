class Solution {
    List<List<Integer>> l;
    public void run(int[] nums,int k,Stack<Integer> s){
        if(k < 0){
        	l.add((Stack)s.clone());
            return;
        }
        run(nums,k - 1,s);
        s.add(nums[k]);
        run(nums,k - 1,s);
        s.pop();
    }
    public List<List<Integer>> subsets(int[] nums) {
        l = new LinkedList<List<Integer>>();
        run(nums,nums.length - 1,new Stack<Integer>());
        return l;
    }
}
