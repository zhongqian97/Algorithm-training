class Solution {
    int Sum = 0;
    public void run(int[] nums,int S,int k,int sum){
        if(k >= nums.length){
            if(S == sum)Sum ++;
            return;
        }
        sum += nums[k];
        run(nums,S,k+1,sum);
        sum -= 2 * nums[k];
        run(nums,S,k+1,sum);
        sum += nums[k];
    }
    public int findTargetSumWays(int[] nums, int S) {
        if(nums.length == 0)return 0;
        int[] dp = new int[nums.length - 1];
        run(nums,S,0,0);
        return Sum;
    }
}
