class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] dp = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i ++)dp[i] = nums[i];
        Arrays.sort(dp);
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i ++,sum ++)if(dp[i] != nums[i])break;
        if(sum == nums.length)return 0;
        for(int i = nums.length - 1 ; i >= 0 ; i --,sum ++)if(dp[i] != nums[i])break;
        return nums.length - sum;
    }
}
