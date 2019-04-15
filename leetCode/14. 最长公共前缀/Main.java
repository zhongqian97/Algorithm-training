class Solution {
    public String longestCommonPrefix(String[] strs) {
        HashMap<String,Integer> m = new HashMap<>();
        for(int i = 0 ; i < strs.length ; i ++){
            for(int k = 0 ; k < strs[i].length() ; k ++){
                m.put(strs[i].substring(0, k+1),m.getOrDefault(strs[i].substring(0, k+1), 0) + 1);
            }
        }
        String x = "";
        for(String i : m.keySet()) {
        	if(m.get(i) == strs.length) {
        		if(x.length() < i.length()) {
        			x = i;
        		}
        	}
        }
        return x;
    }
}
