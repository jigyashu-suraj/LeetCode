class Solution {
    public int[] sumZero(int n) {
        int [] arr = new int[n];
        int j = 0;
        for(int i=1,k=1;i<=n/2;i++){
            arr[j]=i;
            arr[j+1]=-i;
            j=j+2;
        }
        return arr;
    }
}