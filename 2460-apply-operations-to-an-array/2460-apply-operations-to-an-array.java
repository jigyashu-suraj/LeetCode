class Solution {
    public int[] applyOperations(int[] nums) {
        int k=0;
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i] *=2;
                nums[i+1] = 0;
            }
             if(nums[i]!=0)nums[k++]=nums[i];
        }
        if(nums[n-1]!=0)nums[k++]=nums[n-1];
        for(int j=k;j<n;j++)nums[j]=0;
        // int idx = 0;
        // for(int i = 0;i<nums.length;i++)
        //     if(nums[i]!=0)
        //         nums[idx++] = nums[i];
        // for(int i = idx;i<nums.length;i++)
        //         nums[i] = 0;
        return nums;
    }
}