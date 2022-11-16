class Solution {
    public boolean judgeSquareSum(int c) {
        long b = (int)Math.sqrt(c);
        long a = 0;
        while(a<=b){
            long p = a*a + b*b;
            if(p == c)
                return true;
            else if(p<c)
                a++;
            else
               b--; 
        }
        return false;
}
}