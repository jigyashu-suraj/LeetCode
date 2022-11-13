class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        Set<Double> st = new HashSet<Double>();
        int n = nums.length;
        int j = n -1;
        for(int i = 0;i<n/2;i++){
            st.add((double)(nums[i]+nums[j])/2);
            j--;
        }
        return st.size();
    }
}