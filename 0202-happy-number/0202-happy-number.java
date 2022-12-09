class Solution {
    public boolean isHappy(int n) {
       while(n!=1 && n !=4){
        int sum = 0,rem;
        while(n !=0){
            rem = n%10;
            sum = sum + rem*rem;
            n /=10;
        }
            n = sum;
            if(n==1)
             return true;
           
        }
        if(n==1)
            return true;
        
        return false;
    }
}