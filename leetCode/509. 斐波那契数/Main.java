class Solution {
    public int fib(int N) {
        if(N  2)return N;
        int a = 0;
        int b = 1;
        int t;
        for(int i = 1 ; i  N ; i ++ ){
            t = a + b ;
            a = b;
            b = t;
        }
        return b;
    }
}