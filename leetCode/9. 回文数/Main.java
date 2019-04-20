class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)return false;
        int n = x;
        int a = 0;
        while(n > 0){
            a *= 10;
            a += n % 10;
            n /= 10;
        }
        return (a == x);
    }
}
