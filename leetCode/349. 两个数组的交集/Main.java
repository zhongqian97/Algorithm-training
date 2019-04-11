class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i1 = 0,i2 = 0;
        HashSet<Integer> l = new HashSet<>();
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
        int i = 0;
        for(Iterator<Integer> it=l.iterator() ; it.hasNext() ; ){
            a[i++] = it.next();
        }
        return a;
    }
}
//学会了使用迭代器
