class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
         ArrayList<Integer> a = new ArrayList<Integer>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0 , j = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] > nums2[j])
                j++;
            else if(nums2[j] > nums1[i])
                i++;
            else{
                a.add(nums1[i]);
                i++;j++;
            }
        }
        int[] res = new int[a.size()];
        i = 0;
        for(int r:a)
            res[i++]=r;
        return res;
        
    }
}