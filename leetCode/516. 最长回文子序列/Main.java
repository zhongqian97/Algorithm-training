class Solution {
    public int longestPalindromeSubseq(String s) {
        if(s.length() == 0)return 0;
        int l = s.length();
        int[][] dp = new int[l][l];
        int max = 1;
        for(int i = 0 ; i < l ; i ++)dp[i][i] = 1;
        for(int i = 1 ; i < l ; i ++){
            for(int k = 0 ; k + i < l ; k ++){
                if(s.charAt(k + i) == s.charAt(k)){
                    dp[k][k + i] = dp[k + 1][k + i - 1] + 2;
                    max = Math.max(max, dp[k][k + i]);
                }else{
                    dp[k][k + i] = Math.max(dp[k][k + i - 1], dp[k + 1][k + i]);
                }
            }
        }
        return max;
    }
}
