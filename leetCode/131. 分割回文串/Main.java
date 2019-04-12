class Solution {
	LinkedList<List<String>> l;
    //r() 判断是否为回文数
	public boolean r(String s) {
		for(int i = 0 ; i <= s.length()/2 - 1 ; i ++) {
			if(s.charAt(i) != s.charAt(s.length() - i - 1))return false;
		}
		return true;
	}
	public void run(String s, int[][] x, int k, Stack<String> a) {
		if(k >= s.length()) {
			l.add((List<String>)a.clone());
			return;
		}
		for(int i = k; i < s.length() ; i ++) {
			if(x[k][i] == 1) {
				a.push(s.substring(k, i + 1));
				run(s, x, i + 1, a);
				a.pop();
			}
		}
	}
    //run() DFS
    public List<List<String>> partition(String s) {
        l = new LinkedList<List<String>>();
        int[][] x = new int[s.length()][s.length()];//保存可选路径
        
        for(int i = 0 ; i < s.length(); i ++){
            for(int k = i ; k < s.length() ; k ++){
                if(r(s.substring(i, k + 1)))x[i][k] = 1;
            }
        }
        run(s, x, 0, new Stack<String>());
        return l;
    }
}
