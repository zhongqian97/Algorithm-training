class Solution {
    /*
     * @param :  A list of integers
     * @return: A list of unique permutations
     */
	List<List<Integer>> list = new LinkedList<List<Integer>>();
	List<Integer> a=new LinkedList<Integer>();
	HashMap<LinkedList,Boolean> q=new HashMap<LinkedList,Boolean>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        // write your code here
    	for(int i=0;i<nums.length;i++) {
    		a.add(nums[i]);
    	}
    	f(0,nums.length);
    	return list;
    }
    public void f(int k,int n) {
    	if(k>=n) {
    		LinkedList<Integer> aa=new LinkedList<Integer>();
    		aa.addAll(a);
    		if(q.containsKey(a)==false) {
    			q.put(aa, true);
    			list.add(aa);
    		}
    		return;
    	}
    	for(int i=k;i<n;i++) {
    		{int t=a.get(i);a.set(i,a.get(k));a.set(k, t);}
    		f(k+1,n);
    		{int t=a.get(i);a.set(i,a.get(k));a.set(k, t);}
    	}
    }
}
