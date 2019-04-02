//DP直接做就行
class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix.length == 0)return 0;
        int[][] dp = new int[matrix.length][matrix[0].length];//该点最大的面积的边长
        int[][] h = new int[matrix.length][matrix[0].length];//该点最大的行
        int[][] l = new int[matrix.length][matrix[0].length];//该点最大的列  
        int max = 0;
        for(int i = 0 ; i < matrix.length ; i ++){
            for(int k = 0 ; k < matrix[0].length ; k ++){
                if(matrix[i][k] == '1'){
                    l[i][k] = (i - 1 >= 0 && l[i - 1][k] > 0)?1 + l[i - 1][k]:1;
                    h[i][k] = (k - 1 >= 0 && h[i][k - 1] > 0)?1 + h[i][k - 1]:1;
                    if(i - 1 >= 0 && k - 1 >= 0){
                        dp[i][k] = 1 + Math.min(Math.min(h[i][k - 1],l[i - 1][k]),dp[i - 1][k - 1]);//谁最小我就要谁，核心代码
                    }
                    dp[i][k] = (dp[i][k] == 0)?1:dp[i][k];//防止不走if没赋值
                    max = Math.max(max,dp[i][k]);
                }
            }
        }
        return max*max;//求面积
    }
}
