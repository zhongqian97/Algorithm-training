class Solution {
    LinkedList<String> l = new LinkedList<>();
    public List<String> run(String s, int i, int k){
        if(i == 0 && k == 0){
            l.add(s);
            return l;
        }
        if(i <= k){
            if(i > 0)run(s + "(", i - 1, k);
            if(k > 0)run(s + ")", i, k - 1);
        }
        return l;
    }
    public List<String> generateParenthesis(int n) {
        return run("", n, n);
    }
}
