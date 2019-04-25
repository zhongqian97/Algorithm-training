class Solution {
    public List<Boolean> prefixesDivBy5(int[] A) {
        LinkedList<Boolean> dp = new LinkedList<Boolean>();
        int x = 0;
        for(int i = 0 ; i < A.length ; i ++){
            x *= 2;
            x += A[i];
            if(x % 5 == 0)dp.add(true);
            else dp.add(false);
            x %= 5;
        }
        return dp;
    }
}
