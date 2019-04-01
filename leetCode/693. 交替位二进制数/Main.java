
class Solution {
    public boolean run(int n,int i){
        return (i == n % 2)?false:(n == 0)?true:run(n/2,n%2);
    }
    public boolean hasAlternatingBits(int n) {
        return run(n/2,n%2);
    }
}
