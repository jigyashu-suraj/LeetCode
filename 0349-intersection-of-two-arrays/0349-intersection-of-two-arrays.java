class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> a = new HashSet<Integer>();
        for(int i : nums1){
            for(int j:nums2)
                if(i == j){
                    a.add(i);
                    break;
                }
        }
        int[] res = new int[a.size()];
        int i = 0;
        for(int r:a)
            res[i++]=r;
        return res;
       
    }
}