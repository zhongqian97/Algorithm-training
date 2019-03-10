public class Main {
	public static void main(String[] args){
		int[] A ={-7,-3,2,3,11};
		int[] a = sortedSquares(A);
		for(int i : a){
			System.out.println(i);
		}
	}
	public static int[] sortedSquares(int[] A) {
        int[] a = new int[A.length];
        if(A.length == 0)return null;
        int min = 0;
        for(int i = 0 ; i < A.length ; i ++ ){
        	if(A[i] < 0)A[i] *= (-1);
        	if(A[min] > A[i]){
        		min = i;
        	}
        }
        int i = min - 1;
        int k = min + 1;
        a[0] = A[min] * A[min];
        int o = 1;
        while(i >= 0 || k < A.length){
        	if( i >= 0 && k < A.length){
        		if(A[i] > A[k]){
        			a[o++] = A[k] * A[k];
        			k++;
        		}else{
        			a[o++] = A[i] * A[i];
        			i--;
        		}
        	}else if(i < 0){
        		a[o++] = A[k] * A[k];
        		k++;
        	}else{
        		a[o++] = A[i] * A[i];
        		i--;
        	}
        }
        return a;
    }
}