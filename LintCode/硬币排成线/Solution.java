class Solution {
    /**
     * @param n: An integer
     * @return: A boolean which equals to true if the first player will win
     */
    public boolean firstWillWin(int n) {
        // write your code here
    	int[] a=new int[n+1];
    	if(n>=1)a[1]=1;
    	if(n>=2)a[2]=1;
    	for(int i=3;i<=n;i++) {
    		if(a[i-1]>0&&a[i-2]>0)a[i]=0;
    		else a[i]=1;
    	}
    	return (a[n]>0);
    }
}
