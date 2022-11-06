class Solution {
    public boolean isThree(int n) {
        int count = 0;
        for(int i =2;i<=n/2;i++){
            System.out.println(i);
            if(n%i==0)
                count++;
            else if(count>=2)
                break;
        }
        if(count==1)
            return true;
        return false;
    }
}