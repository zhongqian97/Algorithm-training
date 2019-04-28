//执行用时 : 84 ms, 在Range Sum Query - Immutable的Java提交中击败了98.52% 的用户
//内存消耗 : 41.1 MB, 在Range Sum Query - Immutable的Java提交中击败了98.46% 的用户
class NumArray {
    private int[] dp;
    public NumArray(int[] nums) {
        dp = new int[nums.length + 1];
        for(int i = 1 ; i <= nums.length ; i ++){
            dp[i] = dp[i - 1] + nums[i - 1];
        }
    }
    public int sumRange(int i, int j) {
        return dp[j + 1] - dp[i];
    }
}

