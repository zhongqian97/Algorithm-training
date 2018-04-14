public class Solution {
    /**
     * @param A: A string
     * @param B: A string
     * @return: The length of longest common subsequence of A and B
     */
    public int longestCommonSubsequence(String A, String B) {
        // write your code here
        int sum=0;
    	if(A.length()==0&&B.length()==0)return 0;
    	int[][] dp=new int[A.length()][B.length()];
    	for(int i=0;i<A.length();i++) {
    		for(int k=0;k<B.length();k++) {
    			if(A.charAt(i)==B.charAt(k)) {
    				dp[i][k]=((i>0&&k>0)?dp[i-1][k-1]:0)+1;
    			}else {
    				dp[i][k]=Math.max((k>0)?dp[i][k-1]:0, (i>0)?dp[i-1][k]:0);
    			}
    		}
    	}
    	return dp[A.length()-1][B.length()-1];
    }
}
