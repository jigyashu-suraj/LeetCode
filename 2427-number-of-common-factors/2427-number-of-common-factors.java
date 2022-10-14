class Solution {
    public int commonFactors(int a, int b) {
        int n,count=0;
        if(a>=b)
            n = a;
        else 
            n = b;
        for(int i=1;i<=n/2;i++)
            if(a%i ==0 && b%i == 0){
                count++;
                System.out.print(i+" ");
            }
        if(a == b)
            count++;
        return count;
    }
}