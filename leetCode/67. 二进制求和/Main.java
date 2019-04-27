class Solution {
    public String addBinary(String a, String b) {
        String s = "";
        int t = 0;
        while(t == 1 || a.length() > 0 || b.length() > 0){
            int aa = (a.length() > 0)?(int)a.charAt(a.length() - 1) - (int)'0':0;
            int bb = (b.length() > 0)?(int)b.charAt(b.length() - 1) - (int)'0':0;
            t += aa + bb;
            s = (char)((int)'0' + t % 2) + s;
            t /= 2;
            if(a.length() > 0)a = a.substring(0,a.length() - 1);
            if(b.length() > 0)b = b.substring(0,b.length() - 1);
        }
        return s;
    }
}
