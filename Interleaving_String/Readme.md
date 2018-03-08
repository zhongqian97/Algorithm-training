[TOC]
#题目链接
- <http://www.lintcode.com/en/problem/interleaving-string/>
#我的分析
- PS：第一次在github上写东西有点激动。。。
- DFS
- 做DP这类题，我认为就是把递归式子写好，找到i-1跟i之间的关系，然后放到数组里，用i-1推i，也就差不多了。但是这道题，我只能写出递归式子，s1于S2是一样的话，那么它他就有两种走向。我只能写到这里了。日后想到在写。
- 在这道题中，我之前犯了一个非常之大的错误，就是把s2.equals(s3)写成了s2==s3，但是我找不出原因证明为什么他是错的。
#错的那个S2==S3的代码
```
class Solution {
    /**
     * @param s1: A string
     * @param s2: A string
     * @param s3: A string
     * @return: Determine whether s3 is formed by interleaving of s1 and s2
     */
    public boolean isInterleave(String s1, String s2, String s3) {
        // write your code here
        if(s1.length()==0)return (s2==s3);
        if(s2.length()==0)return (s1==s3);
        boolean q=false;
        if(s1.length()>0&&s1.charAt(0)==s3.charAt(0))q=isInterleave(s1.substring(1), s2, s3.substring(1));
        if(q==true)return true;
        if(s2.length()>0&&s2.charAt(0)==s3.charAt(0))q=isInterleave(s1, s2.substring(1), s3.substring(1));
        return q;
    }
}
```
