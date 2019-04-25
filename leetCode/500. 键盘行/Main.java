//执行用时 : 2 ms, 在Keyboard Row的Java提交中击败了86.19% 的用户
//内存消耗 : 34 MB, 在Keyboard Row的Java提交中击败了92.93% 的用户
class Solution {
    public String[] findWords(String[] words) {
        boolean[] dp = new boolean[words.length];
        int sum = 0;
        String qp = "qwertyuiopQWERTYUIOP";
        String al = "asdfghjklASDFGHJKL";
        String zm = "zxcvbnmZXCVBNM";
        HashMap<Character,Integer> m = new HashMap<>();
        for(int i = 0 ; i < qp.length() ; i ++)m.put(qp.charAt(i),1);
        for(int i = 0 ; i < al.length() ; i ++)m.put(al.charAt(i),2);
        for(int i = 0 ; i < zm.length() ; i ++)m.put(zm.charAt(i),3);
        for(int i = 0 ; i < words.length ; i ++){
            if(words[i].equals("") || words[i] == null)continue;
            int k = m.get(words[i].charAt(0));
            int a = k;
            int j = 1;
            while(j < words[i].length() && k == a){
                a = m.get(words[i].charAt(j++));
            }
            if(a == k){
                dp[i] = true;
                sum ++;
            }
        }
        String[] x = new String[sum];
        if(sum == words.length)return words;
        for(int i = 0, k = 0 ; i < words.length ; i ++){
            if(dp[i])x[k++] = words[i];
        }
        return x;
    }
}
