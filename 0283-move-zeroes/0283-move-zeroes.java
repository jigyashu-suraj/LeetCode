class Solution {
    public void moveZeroes(int[] nums) {
        int i=0,j=0,temp;
        while(j<nums.length){
            if(nums[j]==0){
                j++;
            }
            else{
                temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;j++;
            }
        }
    }
}