class Solution {
    public boolean isPerfectSquare(int num) {
        int i = 0, j = num;
        while (i <= j)
        {
            int mid = i + (j - i) / 2;
            if (mid > num * 1.0 / mid)
                j = mid - 1;
            else if (mid < num * 1.0 / mid)
                i = mid + 1;
            else return true;
        }
        return false;
    }
}
