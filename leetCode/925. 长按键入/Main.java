class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0, k = 0;
        while(i < name.length() && k < typed.length()){
            if(name.charAt(i) == typed.charAt(k)){
                i ++;
                k ++;
            }else{
                if(i > 0 && name.charAt(i - 1) == typed.charAt(k)){
                    k ++;
                }else{
                    return false;
                }
            }
        }
        return (i == name.length());
    }
}
