class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> m = new HashSet<>();
        int sum = 0;
        for(int i = 0 ; i < s.length() ; i ++) {
        	if(m.contains(s.charAt(i))) {
        		sum ++;
        		m.remove(s.charAt(i));
        	}else {
        		m.add(s.charAt(i));
        	}
        }
        return ((m.size() > 0)?1:0) + sum * 2;
    }
}

