class Solution {
    public int[] numberOfPairs(int[] nums) {
    List<Integer> a = new ArrayList<Integer>();
    int n = nums.length,count=0,i=0,l[] = new int[2] ;
    for(int j=0;j<n;j++)
        a.add(nums[j]);
    Collections.sort(a);
    while(i<a.size()-1){
       boolean flag = true;
       if(a.get(i) == a.get(i+1)){
            count++;
            a.remove(i);
            a.remove(i);
            flag = false;
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