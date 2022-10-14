class Solution {
    public int commonFactors(int a, int b) {
        int count=1;
        for(int i=2;i<=gcd(a,b);i++)
            if(a%i ==0 && b%i == 0){
                count++;
            }
        return count;
    }
    int gcd(int a, int b){
        if(a==0){
            return b;
        }
        return gcd(b%a, a);
    }
}