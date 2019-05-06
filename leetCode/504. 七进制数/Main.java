class Solution {
    public String convertToBase7(int num) {
        if(num == 0)return "0";
        int n = Math.abs(num);
        String s = "";
        while(n > 0){
            s = Integer.toString(n % 7) + s;
            n /= 7;
        }
        return ((num < 0) ? "-" : "") + s;
    }
}
