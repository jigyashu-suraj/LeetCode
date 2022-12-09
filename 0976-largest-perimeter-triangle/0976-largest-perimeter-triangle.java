class Solution {
    public int largestPerimeter(int[] nums) {
        int s = 0;
        Arrays.sort(nums);
        for(int i = nums.length -1;i>1;i--){
            if(nums[i-1]+nums[i-2]>nums[i])
                return nums[i-1]+nums[i-2]+nums[i];
        }
        return 0;
    }
}

