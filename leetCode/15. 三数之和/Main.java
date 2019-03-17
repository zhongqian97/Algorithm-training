class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ls = new ArrayList<>();
 
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {  // 跳过可能重复的答案
 
                int l = i + 1, r = nums.length - 1, sum = 0 - nums[i];
                while (l < r) {
                    if (nums[l] + nums[r] == sum) {
                        ls.add(Arrays.asList(nums[i], nums[l], nums[r]));
                        while (l < r && nums[l] == nums[l + 1]) l++;
                        while (l < r && nums[r] == nums[r - 1]) r--;
                        l++;
                        r--;
                    } else if (nums[l] + nums[r] < sum) {
                        while (l < r && nums[l] == nums[l + 1]) l++;   // 跳过重复值
                        l++;
                    } else {
                        while (l < r && nums[r] == nums[r - 1]) r--;
                        r--;
                    }
                }
            }
        }
        return ls;
    }
}
//这个代码我是直接抄leetcode上面的，他这个排除重复方法十分之强大！排序加判断相邻

//下面代码是我的代码，据无敌暴力


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> l = new LinkedList<List<Integer>>();
        HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
        HashMap<String,Integer> s = new HashMap<String, Integer>();
        if(nums.length == 0) return l;
        Arrays.sort(nums);
        m.put(nums[0],0);
        for(int i = 1 ; i < nums.length ; i ++ ){
            for(int k = i + 1 ; k < nums.length ; k ++ ){
            	String ss = Integer.toString(-1 * (nums[i] + nums[k]))
 			   + Integer.toString(nums[i]) + Integer.toString(nums[k]);
               if(m.containsKey(-1 * (nums[i] + nums[k])) 
            		   && !s.containsKey(ss)){
            	   List<Integer> x = new ArrayList<Integer>();
            	   x.add(-1 * (nums[i] + nums[k]));
            	   x.add(nums[i]);
            	   x.add(nums[k]);
            	   l.add(x);
            	   s.put(ss, 0);
               }
            }
            m.put(nums[i],i);
        }
        return l;
    }
}
