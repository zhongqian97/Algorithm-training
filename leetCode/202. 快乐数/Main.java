class Solution {
    public int run(int n){
        int sum = 0;
        while(n > 0){
            sum += (n % 10) * (n % 10);
            n /= 10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        HashSet<Integer> m = new HashSet<>();
        m.add(n);
        while(true){
            n = run(n);
            if(n == 1)return true;
            if(m.contains(n))return false;
            m.add(n);
        }
    }
}
