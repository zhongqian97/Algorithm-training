class Solution {
    public int bulbSwitch(int n) {
        int sum=0;
        for(int i=1;i*i<=n;i++)sum++;
        return sum;
    }
}
/*

因数重复，能平方的数，它的因数都是重复的，就意味着它的因数总数是一个奇数。
奇数 = 灯泡亮
偶数 = 灯泡关

 */
