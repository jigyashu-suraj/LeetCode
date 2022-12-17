class Solution {
    public int[] sumZero(int n) {
        int [] arr = new int[n];
        int j = n-1;
        for(int i=0,k=1;i<n/2;i++,j--,k++){
            arr[i]=k;
            arr[j]=-k;
        }
        return arr;
        
    }
}