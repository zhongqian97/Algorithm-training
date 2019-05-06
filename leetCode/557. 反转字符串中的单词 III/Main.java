class Solution {
    public String re(String s){
        if(s.length() == 1)return s;
        return s.charAt(s.length() - 1) + re(s.substring(0,s.length() - 1));
    }
    public String reverseWords(String s) {
        String x = "", a = "";
        for(int i = 0 ; i < s.length() ; i ++){
            if(s.charAt(i) == ' '){
                a += re(x) + ' ';
                x = "";
            }else x += s.charAt(i);
        }
        if(x.length() > 0) a += re(x) + ' ';
        return (a.length() > 0) ? a.substring(0, a.length() - 1) : "";
    }
}
