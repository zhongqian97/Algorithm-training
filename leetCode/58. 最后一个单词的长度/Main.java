class Solution {
    public int lengthOfLastWord(String s) {
        int num = 0;
        for(int i = s.length() - 1 ; i >= 0 ; i --){
            if(num > 0 && s.charAt(i) == ' ')return num;
            if(s.charAt(i) == ' ')continue;
            num ++;
        }
        return num;
    }
}
