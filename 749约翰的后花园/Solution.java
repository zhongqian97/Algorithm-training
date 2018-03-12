
class Solution {
    /**
     * @param x: the wall's height
     * @return: YES or NO
     */
	static int[] a=new int[1001];
    public String isBuild(int x) {
        // write you code here
    	if(a[3]==0) {
    		a[3]=1;
    		a[7]=1;
    		for(int i=0;i<=1000/3;i++) {
    			for(int k=1;k<=1000/7;k++) {
    				if(i*3+k*7<=1000)a[i*3+k*7]=1;
    			}
    		}
    	}
    	if(a[x]==1)return "YES";
    	return "NO";
    }
}
