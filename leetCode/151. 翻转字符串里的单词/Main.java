class Solution {
    public String reverseWords(String s) {
        Stack<String> a = new Stack<>();
        String x = "";
        for(int i = 0 ; i < s.length() ;i ++){
            if(s.charAt(i) == ' '){
                if(!x.equals("")){
                    a.add(x);
                    x = "";
                }
                continue;
            }
            x += s.charAt(i);
        }
        if(!x.equals(""))a.add(x);
        x = "";
        for(int i = a.size() ; i > 0 ; i--){
            x += a.pop();
            x += " ";
        }
        return (x.length() > 0)?x.substring(0,x.length() - 1):"";
    }
}
