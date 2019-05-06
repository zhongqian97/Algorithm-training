class Solution {
    LinkedList<String> l;
    public boolean iF(String s, int flag){
        if(flag > 0){
            if(s.charAt(s.length() - 1) == '0')return false;
            s = s.substring(0, flag);
        }
        return (s.length() == 1) || (s.length() > 1 && s.charAt(0) != '0');
    }
    public void run(String left, String right){
        for(int i = 0 ; i < left.length() ; i ++){
            String x, y;
            if(i == 0)x = left;
            else x = left.substring(0, i) + '.' + left.substring(i, left.length());
            if(iF(x, i))
            for(int k = 0 ; k < right.length() ; k ++){
                if(k == 0) y = right;
                else y = right.substring(0, k) + '.' + right.substring(k, right.length()); 
                if(iF(y, k)){
                    l.add("(" + x + ", " + y + ")");
                }
            }
        }
    }
    public List<String> ambiguousCoordinates(String S) {
        l = new LinkedList<>();
        for(int i = 2 ; i < S.length() - 1 ; i ++){
            run(S.substring(1, i), S.substring(i, S.length() - 1));
        }
        return l;
    }
}
