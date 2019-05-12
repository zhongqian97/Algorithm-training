class Solution {
    public String[] findRelativeRanks(int[] nums) {
        String[] s = new String[nums.length];
        int max = 0;
        for(int i = 0 ; i < nums.length ; i ++)max = Math.max(max, nums[i]);
        int[] dp = new int[max + 1];
        for(int i = 0 ; i < nums.length ; i ++){
            dp[nums[i]] = i + 1;
        }
        for(int i = max, flag = 1 ; i >= 0 ; i --){
            if(dp[i] > 0){
                switch(flag){
                    case 1:s[dp[i] - 1] = "Gold Medal"; break;
                    case 2:s[dp[i] - 1] = "Silver Medal"; break;
                    case 3:s[dp[i] - 1] = "Bronze Medal"; break;
                    default:s[dp[i] - 1] = Integer.toString(flag);
                }
                flag ++;
            }
        }
        return s;
    }
}
