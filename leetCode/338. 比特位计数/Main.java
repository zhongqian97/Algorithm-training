class Solution {
    public int run(int n){
        int sum = 0;
        while(n > 0){
            sum += n % 2;
            n /= 2;
        }
        return sum;
    }
    public int[] countBits(int num) {
        int[] dp = new int[num + 1];
        for(int i = 0 ; i <= num ; i ++){
            dp[i] = run(i);
        }
        return dp;
    }
}
