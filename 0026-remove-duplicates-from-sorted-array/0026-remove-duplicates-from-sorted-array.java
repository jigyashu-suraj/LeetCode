class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> s = new LinkedHashSet<>();
        for(int i=0;i<nums.length;i++)
            s.add(nums[i]);
        int n=s.size();
        List<Integer> list = new ArrayList<>(s);
        for(int i=0;i<list.size();i++)
            nums[i]=list.get(i);
        return n; 
    }
}