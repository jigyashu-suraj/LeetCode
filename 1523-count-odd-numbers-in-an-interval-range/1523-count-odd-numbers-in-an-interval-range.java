class Solution {
    public int countOdds(int low, int high) {
        int c = 0;    
        int s = (high  - low) + 1;
        if(low %2 !=  0 && high %2 !=  0  )
            return s/2+1 ;
        return s/2;
    
        }
    }