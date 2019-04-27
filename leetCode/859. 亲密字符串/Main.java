ass Solution {
    public boolean buddyStrings(String A, String B) {
        if(A.length() != B.length())return false;
        if(A.length() == 0 || B.length() == 0)return false;
        LinkedList<Integer> l = new LinkedList<>();
        for(int i = 0 ; i < A.length() ; i ++){
            if(A.charAt(i) != B.charAt(i))l.add(i);
            if(l.size() > 2)return false;
        }
        if(l.size() == 1)return false;
        if(l.size() == 0){
            HashMap<Character, Integer> m = new HashMap<>();
            for(int i = 0 ; i < A.length() ; i ++)m.put(A.charAt(i), m.getOrDefault(A.charAt(i), 0) + 1);
            for(char c : m.keySet()){
                if(m.get(c) > 1)return true;
            }
            return false;
        }
        String x = A.charAt(l.get(1)) + A.substring(l.get(0) + 1, l.get(1)) + A.charAt(l.get(0));
        if(l.get(0) > 0)x = A.substring(0, l.get(0)) + x;
        if(l.get(1) < A.length() - 1)x += A.substring(l.get(1) + 1, A.length());
        return B.equals(x);
    }
}
