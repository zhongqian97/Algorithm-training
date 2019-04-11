class Solution {
    public int[] diStringMatch(String S) {
        int l = 0;
        int r = S.length();
        int[] dp = new int[S.length() + 1];
        for( int i = 0 ; i < S.length() ; i ++ ){
            if(S.charAt(i) == 'I'){
                dp[i] = l;
                l ++;
            }else{
                dp[i] = r;
                r --;
            }
        }
        dp[S.length()]  = r;
        return dp;
    }
}
