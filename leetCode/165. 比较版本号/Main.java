class Solution {
    public int gets(String x){
        String a = "";
        for(int i = 0 ; i < x.length() ; i ++){
            if(x.charAt(i) != '.')a += x.charAt(i);
            else break;
        }
        return new Integer(a);
    }
    public String s(String x){
        for(int i = 0 ; i < x.length() ; i ++){
            if(x.charAt(i) == '.'){
                return x.substring(i + 1, x.length());
            }
        }
        return "0";
    }
    public int compareVersion(String version1, String version2) {
        if(version1.equals(version2))return 0;
        int x = gets(version1);
        int y = gets(version2);
        if(x > y){
            return 1;
        }else if(x < y){
            return -1;
        }else{
            return compareVersion(s(version1),s(version2));
        }
    }
}
