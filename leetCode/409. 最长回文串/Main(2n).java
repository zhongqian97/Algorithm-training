class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> m = new HashMap<>();
        int sum = 0;
        boolean one = false;
        for(int i = 0 ; i < s.length() ; i ++) {
        	m.put(s.charAt(i), m.getOrDefault(s.charAt(i), 0) + 1);
        }
        for(char i : m.keySet()) {
        	if(m.get(i) % 2 == 1)one = true;
        	sum += m.get(i) / 2;
        }
        return ((one)?1:0) + sum * 2;
    }
}
