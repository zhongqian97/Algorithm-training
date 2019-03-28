class Solution {
	    public int numPairsDivisibleBy60(int[] time) {
	        HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
	        int sum = 0,t;
	        for(int a : time){
                t = a % 60;
	            if(m.containsKey(t)) {
	            	sum += m.get(t);
	            }
                t = (60 - t)%60;
	            m.put(t, (m.containsKey(t)?m.get(t) + 1:1));
	        }
	        return sum;
	    }
	}
//跟leetCode 第一题一样最优解法
