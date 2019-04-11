//超出时间限制！！！
class Solution {
    public int findLHS(int[] nums) {
        int dp = 0;
        for(int i = 0 ; i < nums.length ; i ++ ){
            int flag = 0;
            int min = nums[i];
            int max = nums[i];
            for(int k = 0 ; k < nums.length ; k ++ ){
                if(i != k)
                    if(nums[k] - nums[i] == 1 || nums[k] - nums[i] == 0){
                        min = Math.min(min,nums[k]);
                        max = Math.max(max,nums[k]);
                        if(flag == 0)flag ++;
                        flag ++;
                    }   
            }
            if(max - min == 1)
                dp = Math.max(dp,flag);
        }
        return dp;
    }
}
