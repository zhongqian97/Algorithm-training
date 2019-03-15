class Solution {
    public int maxArea(int[] height) {
	int max = 0;
	for(int i = 0 ; i < height.length ; i ++ ){
	    for(int k = i + 1 ; k < height.length ; k ++ ){
		int t = Math.min(height[i],height[k]) * (k - i);
		max = Math.max(max,t);
	    }
	}
	return max;
    }
}
