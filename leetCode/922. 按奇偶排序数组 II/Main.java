class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int i = 0, k = 1, t;
        while(i < A.length && k < A.length){
            while(i < A.length && A[i] % 2 == 0)i += 2;
            while(k < A.length && A[k] % 2 == 1)k += 2;
            if(i < A.length && k < A.length){
                t = A[i];
                A[i] = A[k];
                A[k] = t;
            }
        }
        return A;
    }
}
