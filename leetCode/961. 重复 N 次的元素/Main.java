class Solution {
    public int repeatedNTimes(int[] A) {
        HashSet<Integer> m = new HashSet<>();
        for(int i : A)
            if(m.contains(i))return i;
            else m.add(i);
        return 0;
    }
}
