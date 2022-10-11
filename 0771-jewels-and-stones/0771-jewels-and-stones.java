class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
       for(char i: stones.toCharArray()){
               if(jewels.indexOf(i)!=-1)
                   count++;
       }
        return count;
        
    }
}