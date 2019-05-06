class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> m = new HashMap<>();
        LinkedList<String> l = new LinkedList<>();
        for(int i = 0 ; i < list1.length ; i ++)m.put(list1[i], i);
        int min = Integer.MAX_VALUE;
        String x = "";
        for(int i = 0 ; i < list2.length ; i ++){
            if(m.containsKey(list2[i])){
                l.add(list2[i]);
                m.put(list2[i], i + m.get(list2[i]));
                min = Math.min(min, m.get(list2[i]));
            }
        }
        for(int i = 0 ; i < l.size() ; i ++){
            if(min != m.get(l.get(i))){
                l.remove(i);
                i --;
            }
        }
        return l.toArray(new String[0]);
    }
}
