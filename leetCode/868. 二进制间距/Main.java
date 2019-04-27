class Solution {
    public int binaryGap(int N) {
        int t = 0;
        int i = -1;
        int max = 0;
        while(N > 0){
            if(N % 2 == 1){
                if(i == -1){
                    i = t;
                }else{
                    max = Math.max(max,t - i);
                    i = t;
                }
            }
            N /= 2;
            t ++;
        }
        return max;
    }
}
