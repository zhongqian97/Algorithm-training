class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if(nums.length == 0)return nums;
        if(r * c != nums.length * nums[0].length)return nums;
        int[][] dp = new int[r][c];
        for(int i = 0, ii = 0, kk = 0 ; i < nums.length ; i ++){
            for(int k = 0 ; k < nums[0].length ; k ++){
                if(kk == c){
                    ii ++;
                    kk = 0;
                }
                dp[ii][kk ++] = nums[i][k];
            }
        }
        return dp;
    }
}
