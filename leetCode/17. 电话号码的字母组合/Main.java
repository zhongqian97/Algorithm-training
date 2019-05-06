class Solution {
    LinkedList<String> l = new LinkedList<>();
    char[][] s = new char[10][4];
    public List<String> run(String a, int i, String x){
        if(i == a.length()){
            l.add(x);
            return l;
        }
        int t = (int)a.charAt(i) - (int)'0';
        for(int k = 0 ; k < 4 ; k ++){
            if(k == 3 && t != 7 && t != 9)break;
            run(a, i + 1, x + s[t][k]);
        }
        return l;
    }
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0)return l;
        s[2][0] = 'a';s[2][1] = 'b';s[2][2] = 'c';
        s[3][0] = 'd';s[3][1] = 'e';s[3][2] = 'f';
        s[4][0] = 'g';s[4][1] = 'h';s[4][2] = 'i';
        s[5][0] = 'j';s[5][1] = 'k';s[5][2] = 'l';
        s[6][0] = 'm';s[6][1] = 'n';s[6][2] = 'o';
        s[7][0] = 'p';s[7][1] = 'q';s[7][2] = 'r';s[7][3] = 's';
        s[8][0] = 't';s[8][1] = 'u';s[8][2] = 'v';
        s[9][0] = 'w';s[9][1] = 'x';s[9][2] = 'y';s[9][3] = 'z';
        return run(digits, 0, "");
    }
}
