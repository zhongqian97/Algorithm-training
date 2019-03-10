public class Main {
	public static void main(String[] args){
		System.out.println();
	}
	public static int minAddToMakeValid(String S) {
        int x = 0;
        int k = 0;
        for(int i = 0 ; i < S.length() ; i ++ ){
        	if(S.charAt(i) == '('){
        		k ++;
        	}else if(k > 0){
        		k --;
        	}else{
        		x ++;
        	}
        }
        return x + k;
    }
}
