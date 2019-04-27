//执行用时 : 5 ms, 在String Compression的Java提交中击败了65.58% 的用户
//内存消耗 : 37.2 MB, 在String Compression的Java提交中击败了86.12% 的用户

class Solution {
    public String run(int press){
        if(press == 0)return "";
        return run(press / 10) + Integer.toString(press % 10);
    }
    public int compress(char[] chars) {
        if(chars.length == 0)return 0;
        int k = 0;
        char c = chars[0];
        int press = 1;
        String x;
        for(int i = 1 ; i < chars.length ; i ++){
            if(c == chars[i]){
                press ++;
            }else{
                chars[k ++] = c;
                c = chars[i];
                if(press > 1){
                    x = run(press);
                    for(int ii = 0 ; ii < x.length() ; ii ++)chars[k ++] = x.charAt(ii);
                    press = 1;
                }
                if(i + 1 == chars.length){
                    chars[k ++] = c;
                }
            }
            if(i + 1 == chars.length && press > 1){
                chars[k ++] = c;
                if(press > 1){
                    x = run(press);
                    for(int ii = 0 ; ii < x.length() ; ii ++)chars[k ++] = x.charAt(ii);
                    press = 1;
                }
            }
        }
        return (k == 0)?1:k;
    }
}
