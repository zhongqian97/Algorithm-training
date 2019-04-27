class Solution {
    public int maxDistToClosest(int[] seats) {
        int m = 0;
        for(int i = 0 ; i < seats.length ; i ++){
            if(seats[i] == 0){
                int max = seats.length + 1;
                for(int k = i + 1 ; k < seats.length ; k ++)if(seats[k] == 1){max = Math.min(max, k - i);break;}
                for(int k = i - 1 ; k >= 0 ; k --)if(seats[k] == 1){max = Math.min(max, i - k);break;}
                m = Math.max(m, max);
            }
        }
        return m;
    }
}
