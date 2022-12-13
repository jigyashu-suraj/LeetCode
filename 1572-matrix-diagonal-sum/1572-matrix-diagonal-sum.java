class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0,n=mat.length,j=n-1;
        for(int i =0;i<n;i++,j--){
            if(i == j)
                sum +=mat[i][i];
            else 
                 sum +=mat[i][i]+mat[i][j];
        }
        return sum;
    }
}