class Solution {
    public int[] numberOfPairs(int[] nums) {
    List<Integer> a = new ArrayList<Integer>();
    int n = nums.length,count=0, l[] = new int[2] ;
    for(int i=0;i<n;i++)
        a.add(nums[i]);
    for(int i = 0;i<a.size();){
       boolean flag = true;
        for(int j = i+1;j<a.size();j++){
            if(a.get(i) == a.get(j)){
                count++;
                a.remove(i);
                a.remove(j-1);
                flag = false;
                break;
            }
        }
        if(flag==true){
            i++;
        }
    }
    l[0] = count;
    l[1] = a.size(); 
    return l;
    }
}