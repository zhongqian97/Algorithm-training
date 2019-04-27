//5ms

class Solution {
    public int maxDistToClosest(int[] seats) {
        int k = -1;
        int max = 0;
        for(int i = 0 ; i < seats.length ; i ++){
            if(seats[i] == 1){
                if(k == -1){
                    max = Math.max(max, i * 2);
                    k = i;
                }
                else{
                    max = Math.max(max, i - k);
                    k = i;
                }
                continue;
            }
            if(i + 1 == seats.length)max = Math.max(max, (seats.length - 1 - ((k != -1)?k:0) ) * 2);
        }
        
        return max / 2;
    }
}
