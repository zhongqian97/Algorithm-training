public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int i = 1,k = n;
        boolean flag = false;
        int a = 0;
        while(i <= k){
            if(i == k){
                if(isBadVersion(i)){
                    return i;
                }else{
                    return 0;
                }
            }
            boolean w = isBadVersion(i + (k - i) / 2);
            if(flag)break;
            if(k - i == 1 && isBadVersion(i) == false && isBadVersion(k) == true)break;
            if(w){
                k = i + (k - i) / 2;
            }else{
                i = i + (k - i) / 2;
            }
        }
        return k;
    }
}
