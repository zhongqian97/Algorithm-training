class Solution {
    public int countPrimes(int n) {
        if(n < 3)return 0;
        boolean[] dp = new boolean[n + 1];
        int sum = 0;
        for(int i = 2 ; i < n ; i ++){
            if(!dp[i]){
                sum ++;
                for(int k = 2 ; k * i < n ; k ++)dp[i * k] = true;
            }
        }
        return sum; 
    }
}
