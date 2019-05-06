class Solution {
    HashMap<String, Integer> m = new HashMap<>();
    public int run(int num, String x){
        m.put(x, m.getOrDefault(x, 0) + num);
        for(int i = 0 ; i < x.length() ; i ++){
            if(x.charAt(i) == '.'){
                return run(num, x.substring(i + 1, x.length()));
            }
        }
        return 0;
    }
    public List<String> subdomainVisits(String[] cpdomains) {
        for(int i = 0 ; i < cpdomains.length ; i ++){
            String num = "", x = "";
            for(int k = 0 ;  ; k ++){
                if(cpdomains[i].charAt(k) == ' '){
                    x = cpdomains[i].substring(k + 1, cpdomains[i].length());
                    break;
                }
                num += cpdomains[i].charAt(k);
            }
            run(new Integer(num), x);
        }
        LinkedList<String> l = new LinkedList<>();
        for(String x : m.keySet()){
            l.add(Integer.toString(m.get(x)) + ' ' + x);
        }
        return l;
    }
}
