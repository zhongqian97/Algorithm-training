class Solution {
    public int run(int I,int K, int[][] grid,int[][] dp){
        if(I >= grid.length || K >= grid[0].length || I < 0 || K < 0 || dp[I][K] == 1 || grid[I][K] == 0)return 0;
        int max = 1;
        dp[I][K] = 1;
        for(int i = -1 ; i < 2 ; i ++){
            for(int k = -1 ; k < 2 ; k ++){
                if((i+k==1||i+k==-1) == true)
                    max += run(I-i,K-k,grid,dp);
            }
        }
        return max;
    }
    public int maxAreaOfIsland(int[][] grid) {
        if(grid.length == 0)return 0;
        int h = grid.length;
        int l = grid[0].length;
        int[][] dp = new int[h][l];
        int max = 0;
        for(int i = 0 ; i < h ; i ++ ){
            for(int k = 0 ; k < l ; k ++ ){
                int t = run(i,k,grid,dp);
                if(max < t)max = t;
            }
        }
        return max;
    }
}