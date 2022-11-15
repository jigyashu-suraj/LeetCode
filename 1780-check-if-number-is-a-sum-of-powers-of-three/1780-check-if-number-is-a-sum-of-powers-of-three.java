class Solution {
    public boolean checkPowersOfThree(int n) {
        int a = 3;
        for(int i=15;i>=0; i--)
        {
            double p = Math.pow(a,i);
            if(n-p>=0) n = n - (int)p;
            if(n==0) return true;
        }
        return false;
        
    }
}