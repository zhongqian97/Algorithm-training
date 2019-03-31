class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int sum = 0;
        HashMap<String,Integer> m = new HashMap<>();
        String s;
        for(int i = 0 ; i < points.length ; i ++){
            for(int k = i + 1 ; k < points.length ; k ++){
                double x = x = Math.pow((points[i][0] - points[k][0]),2) + Math.pow((points[i][1] - points[k][1]),2);
                s = Integer.toString(i) + "+" + Double.toString(x);
                m.put(s,m.getOrDefault(s,0) + 1);
                s = Integer.toString(k) + "+" + Double.toString(x);
                m.put(s,m.getOrDefault(s,0) + 1);
            }
        }
        for(String a : m.keySet()){
            int t = m.get(a);
            sum += (t * (t - 1));
        }
        return sum;
    }
}
