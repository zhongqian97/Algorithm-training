class Solution {
    /**
     * @param s1: A string
     * @param s2: A string
     * @param s3: A string
     * @return: Determine whether s3 is formed by interleaving of s1 and s2
     */
    public boolean isInterleave(String s1, String s2, String s3) {
        // write your code here
        if(s1.length()==0)return (s2.equals(s3));
        if(s2.length()==0)return (s1.equals(s3));
        boolean q=false;
        if(s1.length()>0&&s1.charAt(0)==s3.charAt(0))q=isInterleave(s1.substring(1), s2, s3.substring(1));
        if(q==true)return true;
        if(s2.length()>0&&s2.charAt(0)==s3.charAt(0))q=isInterleave(s1, s2.substring(1), s3.substring(1));
        return q;
    }
}
