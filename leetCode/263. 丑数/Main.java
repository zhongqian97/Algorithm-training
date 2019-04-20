class Solution {
    public boolean isUgly(int num) {
        if(num <= 0)return false;
        boolean flag = false;
        while(true){
            flag = false;
            if(num % 2 == 0 || num % 3 == 0 || num % 5 == 0){
                flag = true;
                if(num % 2 == 0)num /= 2;
                if(num % 3 == 0)num /= 3;
                if(num % 5 == 0)num /= 5;
            }
            if(!flag && num != 1)return false;
            if(num == 1)return true;
        }
    }
}
