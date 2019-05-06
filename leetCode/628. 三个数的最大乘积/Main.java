class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int max = Integer.MIN_VALUE;
        max = Math.max(max, nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]);//全正||全负
        max = Math.max(max, nums[nums.length - 1] * nums[0] * nums[1]);//两负一正
        return max;
    }
}
