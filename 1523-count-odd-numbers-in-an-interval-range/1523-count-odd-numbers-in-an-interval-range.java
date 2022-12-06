class Solution {
    public int countOdds(int low, int high) {
        // int s = (high  - low) + 1;
        // if(low %2 !=  0 && high %2 !=  0  )
        //     return s/2+1 ;
        // return s/2;
        
        int s = (high-low)/2;
        if(low%2!=0 || high%2!=0)
            return s+1;
        return s;
    
        }
    }