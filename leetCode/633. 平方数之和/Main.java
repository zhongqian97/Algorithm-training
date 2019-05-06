class Solution {
    public boolean judgeSquareSum(int c) {
        int k = (int)Math.sqrt(c), i = 0, sum;
        while(i <= k){
            sum = i * i + k * k;
            if(sum == c)return true;
            else if(sum < c) i ++;
            else k --;
        }
        return false;
    }
}
