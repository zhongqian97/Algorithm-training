class Solution {
    public int arrangeCoins(int n) {
        long a = n;
        long i = 1;
        for(i = (long)Math.sqrt(2 * a) ; i * (i + 1) <= 2 * a ; i ++ ){
            if(i * (i + 1) - 2 * a < 0.1)return (int)i;
        }
        return (int)i - 1;
    }
}

//效果一样的简化版

class Solution {
    public int arrangeCoins(int n) {
        long a = (long)Math.sqrt(2 * (long)n);
        if(n < 2 || (1 + a) * a / 2 <= n)
            return (int)a;
        else
            return (int)a - 1;
    }
}

