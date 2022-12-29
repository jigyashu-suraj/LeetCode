class Solution {
    public int pivotIndex(int[] nums) {
        int total=0;int sum=0;
        for(int i: nums)total=total+i;
        if (nums.length==1)return nums[0];
        for(int i=0;i<nums.length-1;i++){
            
            if(0==total-nums[0])return 0;
            sum=sum+nums[i];
            if(sum==total-nums[i+1]-sum)return i+1;
            
        }
        return -1;
        }
}
        