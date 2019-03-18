//栈还是这么好用啊！
	class Solution {
	    public boolean isValid(String s) {
	    	Stack<Character> x = new Stack<Character>();  
	        for(int i = 0 ; i < s.length() ; i++ ){
	        	switch(s.charAt(i)){
	        	case '(':
	        	case '[':
	        	case '{':x.add(s.charAt(i));break;
	        	case ')':if(x.size() <= 0 || x.pop() != '(')return false;break;
	        	case ']':if(x.size() <= 0 || x.pop() != '[')return false;break;
	        	case '}':if(x.size() <= 0 || x.pop() != '{')return false;break;
	        	}
            }
	        if(x.size() != 0)return false;
	        return true;
	    }
	}
