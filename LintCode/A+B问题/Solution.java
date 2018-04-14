public class Solution {
    /**
     * @param a: An integer
     * @param b: An integer
     * @return: The sum of a and b
     */
    public int aplusb(int a, int b) {
        // write your code here
        int sum = 0, carry = 0;  
        while (b!=0) {  
          sum = a ^ b;  
          carry = (a & b) << 1;  
           a = sum;  
           b = carry;  
         }  
     return a;  
    }
}
