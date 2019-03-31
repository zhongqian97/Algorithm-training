//但还是跪了，比不优化的还差
class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int sum = 0;
        double[][] dp = new double[points.length][points.length];
        HashMap<Double,Integer> m;
        for(int i = 0 ; i < points.length ; i ++){
            m = new HashMap<>();
            for(int k = 0 ; k < points.length ; k ++){
                if(i != k){
                    double x;
                    if(i <= k){
                        x = Math.pow((points[i][0] - points[k][0]),2) + Math.pow((points[i][1] - points[k][1]),2);
                        dp[i][k] = x;
                    }
                    else x = dp[k][i];
                    if(m.containsKey(x)){
                        sum += m.get(x);
                    }
                    m.put(x,m.getOrDefault(x,0) + 1);
                }
            }
        }
        return sum*2;
    }
}
