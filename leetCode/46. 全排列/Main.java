class Solution {
    List<List<Integer>> a;
    public void run(int k,LinkedList<Integer> l){
        if(k >= l.size()){
            a.add((List<Integer>) l.clone());
            return;
        }
        for(int i = k ; i < l.size() ; i ++ ){
        	{int t = l.get(i); l.set(i, l.get(k)); l.set(k, t);}
        	run(k + 1, l);
        	{int t = l.get(i); l.set(i, l.get(k)); l.set(k, t);}
        }
    }
    public List<List<Integer>> permute(int[] nums) {
    	a = new LinkedList<List<Integer>>();
    	LinkedList<Integer> l = new LinkedList<Integer>();
    	for(int i = 0 ; i < nums.length ; i ++ ) {
    		l.add(nums[i]);
    	}
    	run(0,l);
    	return a;
    }
}
