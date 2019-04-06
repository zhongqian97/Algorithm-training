class Solution {
	int[] dp;
	public int run(String s,char c) {
		int t = dp[(int)c - (int)'a'];
		char[] a = s.toCharArray();
		for(char i : a) {
			dp[(int)i - (int)'a'] -= t;
		}
		return t;
 	}
    public String originalDigits(String s) {
        dp = new int[26];
        int[] a = new int[10];
        char[] x = s.toCharArray();
        for(char i : x){
        	dp[(int)i - (int)'a'] ++;
        }
        a[0] = run("zero",'z');
        a[6] = run("six",'x');
        a[8] = run("eight",'g');
        a[3] = run("three",'h');
        a[7] = run("seven",'s');
        a[2] = run("two",'w');
        a[4] = run("four",'r');
        a[1] = run("one",'o');
        a[5] = run("five",'f');
        a[9] = run("nine",'i');
        
        s = "";
        for(int i = 0 ; i < 10 ; i ++ ) {
        	for(int k = 0 ; k < a[i] ; k ++ ) {
        		s += Integer.toString(i);
        	}
        }
        return s;
    }
}
