class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
        LinkedList<Integer> l = new LinkedList<>();
        int i = A.length - 1;
        int t = 0;
        while(t > 0 || K > 0 || i >= 0){
            t += ((i >= 0) ? A[i --] : 0) + K % 10;
            K /= 10;
            l.addFirst(t % 10);
            t /= 10;
        }
        return l;
    }
}
