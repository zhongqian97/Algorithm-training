class Solution {
    LinkedList<String> l = new LinkedList<>();
    public LinkedList<String> run(int num, int i, int k, int sumi, int sumk, int cen){
        if(num > cen || sumi > 11 || sumk > 59)return l;
        if(k == 0){
            String x;
            if(sumk > 9)x = Integer.toString(sumk);
            else x = "0" + Integer.toString(sumk);
            l.addFirst(Integer.toString(sumi) + ':' + x);
            return l;
        }
        if(i == 0){
            if(num > 0)run(num - 1, i, k / 2, sumi, sumk + k, cen - 1);
            run(num, i, k / 2, sumi, sumk, cen - 1);
            return l;
        }
        if(num > 0)run(num - 1, i / 2, k, sumi + i, sumk, cen - 1);
        run(num, i / 2, k, sumi, sumk, cen - 1);
        return l;
    }
    public List<String> readBinaryWatch(int num) {
        return run(num, 8, 32, 0, 0, 10);
    }
}
