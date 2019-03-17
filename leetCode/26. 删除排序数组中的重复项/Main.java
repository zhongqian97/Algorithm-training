class Solution {
     public int removeDuplicates(int[] nums) {
	    	if(nums.length == 0)return 0;
	    	int k = 1;//当前不重复指针位置
		int x = 0;//重复个数
	    	boolean flag = false;
	        for(int i = 1 ; i < nums.length ; i ++ ){
		    if(nums[i-1] == nums[i]){//当前一个等于现在一个
			flag = true;//
				x ++ ;
	        	}else{
			if(flag == true){//前一次判断是重复的
	        			flag = false;
	        			nums[k] = nums[i];//覆盖位置
	        		}
	        		k++;
	        	}
                nums[i - x] = nums[i];
	        }
	        return k;
	    }
}
