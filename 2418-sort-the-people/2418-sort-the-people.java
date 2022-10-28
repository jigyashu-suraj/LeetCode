class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = heights.length;
        Map<Integer,String> map = new HashMap<>();
        for(int i = 0 ; i<n;i++)
            map.put(heights[i],names[i]);
        Arrays.sort(heights);
        String[] res = new String[n];
        for(int i = n - 1,idx = 0; i >=0 ;i--)
            res[idx++] = map.get(heights[i]);
        return res;
    }
}