class Solution {
    public int integerReplacement(int n) {
       int count = 0;
       if(n == 2147483647)return 32;
        while(n > 3){
            if(n % 2 == 1){
                if((n & 3) == 3){
                    n += 1;
                    count += 1;
                }else{
                    n /= 2;
                    count += 2;
                }
            }else{
                n /= 2;
                count += 1;
            }
        }
        if(n == 3)count += 2;
        else if(n == 2)count += 1;
        return count;
    }
}
