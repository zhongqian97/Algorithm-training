class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i1 = 0,i2 = 0;
        ArrayList<Integer> l = new ArrayList<>();
        while(i1 < nums1.length && i2 < nums2.length){
            if(nums1[i1] > nums2[i2]){
                i2 ++;
            }else if(nums1[i1] < nums2[i2]){
                i1 ++;
            }else{
                l.add(nums1[i1++]);
                i2++;
            }
        }
        int[] a = new int[l.size()];
        for(int i = 0 ; i < l.size() ; i ++ ){
            a[i] = l.get(i);
        }
        return a;
    }
}
