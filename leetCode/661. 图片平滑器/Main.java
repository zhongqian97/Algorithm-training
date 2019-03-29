//CNN 卷积神经网络池化层。平均池化算法
class Solution {
    public int[][] imageSmoother(int[][] M) {
        if(M.length == 0)return null;
        int flag;
        int[][] dp = new int[M.length][M[0].length];
        for(int i = 0 ; i < M.length ; i ++){
            for(int k = 0 ; k < M[0].length ; k ++){
                dp[i][k] = M[i][k];
                flag = 1;
                if(i + 1 < M.length && k + 1 < M[0].length){
                    dp[i][k] += M[i + 1][k + 1];
                    flag ++;
                }
                if(i + 1 < M.length && k - 1 >= 0){
                    dp[i][k] += M[i + 1][k - 1];
                    flag ++;
                }
                if(i - 1 >= 0 && k + 1 < M[0].length){
                    dp[i][k] += M[i - 1][k + 1];
                    flag ++;
                }
                if(i - 1 >= 0 && k - 1 >= 0){
                    dp[i][k] += M[i - 1][k - 1];
                    flag ++;
                }
                if(i - 1 >= 0){
                    dp[i][k] += M[i - 1][k];
                    flag ++;
                }
                if(i + 1 < M.length){
                    dp[i][k] += M[i + 1][k];
                    flag ++;
                }
                if(k - 1 >= 0){
                    dp[i][k] += M[i][k - 1];
                    flag ++;
                }
                if(k + 1 < M[0].length){
                    dp[i][k] += M[i][k + 1];
                    flag ++;
                }
                dp[i][k] /= flag;
            }
        }
        return dp;
    }
}
