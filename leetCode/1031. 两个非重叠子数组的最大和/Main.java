	class Solution {
	    public int maxSumTwoNoOverlap(int[] a, int L, int M) {
	        int n = a.length;
	        int[] cum = new int[n+1];
	        for(int i = 0;i < n;i++)cum[i+1] = cum[i] + a[i];
	        
	        int ret = Integer.MIN_VALUE / 2;
	        {
		        int max = Integer.MIN_VALUE / 2;
		    	for(int i = 0;i <= n;i++){
		    		if(i >= L+M){
		    			max = Math.max(max, cum[i-M] - cum[i-M-L]);
		    			ret = Math.max(ret, max + cum[i] - cum[i-M]);
		    		}
		    	}
	        }
	        {
		        int max = Integer.MIN_VALUE / 2;
		    	for(int i = 0;i <= n;i++){
		    		if(i >= L+M){
		    			max = Math.max(max, cum[i-L] - cum[i-L-M]);
		    			ret = Math.max(ret, max + cum[i] - cum[i-L]);
		    		}
		    	}
	        }
	    	return ret;
	    }
	}	
