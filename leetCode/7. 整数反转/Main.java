class Solution {
    public int reverse(int x) {
        long n = 0;
        boolean flag = (x < 0);
        if(flag)x *= -1;
        while(x > 0){
            n *= 10;
            n += x % 10;
            x /= 10;
        }
        if(n >= Math.pow(2,31))return 0;
        return (flag) ? (int)n * (-1) : (int)n;
    }
}
