class Solution {
    public String addBinary(String a, String b) {
        String s = "";
        Stack<Character> ax = new Stack<>();
        Stack<Character> bn = new Stack<>();
        for(int i = 0 ; i < a.length() ; i ++)ax.add(a.charAt(i));
        for(int i = 0 ; i < b.length() ; i ++)bn.add(b.charAt(i));
        int t = 0;
        while(t == 1 || ax.size() > 0 || bn.size() > 0){
            int aa = (ax.size() > 0)?(int)ax.pop() - (int)'0':0;
            int bb = (bn.size() > 0)?(int)bn.pop() - (int)'0':0;
            t += aa + bb;
            s = (char)((int)'0' + t % 2) + s;
            t /= 2;
        }
        return s;
    }
}
