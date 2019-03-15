//双指针法
class Solution {
    public int maxArea(int[] height) {
	int max = 0;
	int i = 0;
	int k = height.length - 1;
	while(i < k){
	    int t = 0;
	    if(height[i] > height[k]){
		t = height[k];
		k --;
	    }else{
		t = height[i];
		i ++;
	    }
	    max = Math.max(max,t * (k - i + 1));
	}
	return max;
    }
}
