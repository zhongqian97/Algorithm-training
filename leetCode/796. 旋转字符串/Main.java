class Solution {
    public boolean rotateString(String A, String B) {
        HashSet<String> m = new HashSet<>();
        LinkedList<String> l = new LinkedList<>();
        l.add(A);
        String x;
        if(A.equals(B))return true;
        m.add(A);
        while(!l.isEmpty()){
            A = l.get(0);
            l.remove(0);
            for(int i = 1 ; i < A.length() - 1; i ++){
                x = A.substring(i, A.length()) + A.substring(0, i);
                if(m.contains(x))continue;
                m.add(x);
                if(x.equals(B))return true;
                l.add(x);
            }
        }
        return false; 
    }
}
