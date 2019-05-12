class Solution {
    public int titleToNumber(String s) {
        int sum = 0;
        for(int i = 0 ; i < s.length() ; i ++){
            sum *= 26;
            sum += (int)s.charAt(i) - (int)'A' + 1;
        }
        return sum;
    }
}
