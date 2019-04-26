class Solution {
    public boolean run(String s, String t) {
        if(s.length() != t.length())return false;
        HashMap<Character,Integer> m = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i ++)m.put(s.charAt(i), m.getOrDefault(s.charAt(i), 0) + 1);
        for(int i = 0 ; i < t.length() ; i ++){
            if(!m.containsKey(t.charAt(i)))return false;
            m.put(t.charAt(i), m.get(t.charAt(i)) - 1);
            if(m.get(t.charAt(i)) == 0)m.remove(t.charAt(i));
        }
        return m.isEmpty();
    }
    public List<Integer> findAnagrams(String s, String p) {
        LinkedList<Integer> l = new LinkedList<>();
        for(int i = 0 ; i <= s.length() - p.length() ; i ++){
            if(run(s.substring(i, p.length() + i), p))l.add(i);
        }
        return l;
    }
}
