class Solution {
    public int[] plusOne(int[] digits) {
        if(digits.length == 0)return new int[1];
        digits[digits.length - 1] ++;
        int t = 0;
        for(int i = digits.length - 1 ; i >= 0 ; i --){
            digits[i] += t;
            t = 0;
            if(digits[i] > 9){
                t = digits[i] / 10;
                digits[i] %= 10;
            }
        }
        if(t == 0)return digits;
        int[] dp = new int[digits.length + 1];
        dp[0] = t;
        for(int i = 1 ; i <= digits.length ; i ++)dp[i] = digits[i - 1];
        return dp;
    }
}
