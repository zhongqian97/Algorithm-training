class Solution {
    public String toLowerCase(String str) {
        return str.toLowerCase();
    }
}
/*
多看看别人封装好的函数。。。。
class Solution {
    public String toLowerCase(String str) {
        String s = "";
        for(int i = 0 ; i < str.length() ; i ++ ){
        	if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
        		s += str.charAt(i);
        	}else {
        		s += Character.toLowerCase(str.charAt(i));
        	}
        }
        return s;
    }
}
 */
