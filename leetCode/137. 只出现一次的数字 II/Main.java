
class Solution {
	    public int singleNumber(int[] nums) {
	    	if(nums.length == 0)return 0;
	    	HashMap<Integer, Integer> h= new HashMap<Integer,Integer>();
	    	for(int i = 0 ; i < nums.length ; i ++){
	    		if(h.containsKey(nums[i])){
	    			h.put(nums[i], h.get(nums[i])+1);
	    			if(h.get(nums[i]) == 3){
	    				h.remove(nums[i]);
	    			}
	    		}else{
	    			h.put(nums[i], 1);
	    		}
	    	}
	    	return h.keySet().iterator().next();
	    }
	}
