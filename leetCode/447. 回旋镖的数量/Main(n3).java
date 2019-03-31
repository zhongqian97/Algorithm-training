class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int sum = 0;
        for(int i = 0 ; i < points.length ; i ++){
            for(int k = 0 ; k < points.length ; k ++){
                if(i != k)
                for(int t = 0 ; t < points.length ; t ++){
                    if(i != t && k != t){
                        double x = Math.pow((points[i][0] - points[k][0]),2) + Math.pow((points[i][1] - points[k][1]),2);
                        double y = Math.pow((points[i][0] - points[t][0]),2) + Math.pow((points[i][1] - points[t][1]),2);
                        if(x == y)sum ++;
                    }
                }
            }
        }
        return sum;
    }
}
