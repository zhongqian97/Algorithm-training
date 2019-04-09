class Solution {
    public int searchInsert(int[] nums, int target) {
        int result = Arrays.binarySearch(nums, target);
        return result >= 0 ? result : -result - 1;
    }
}
//看了一眼文档，这个方法完美契合这个题目。。。
