public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int i = 1,k = n;
        boolean flag = false;
        int a = 0;
        while(i <= k){
            int w = guess(i + (k - i) / 2);
            if(flag)break;
            switch(w){
                case 1:
                    i = i + (k - i) / 2 + 1;//+1
                    break;
                case -1:
                    k = i + (k - i) / 2 - 1;//-1
                    break;
                case 0:
                    flag = true;
                    a = i + (k - i) / 2;
            }
        }
        return a;
    }
}
//这个+1 -1 细节必须注意。用二分法都注意这个细节
