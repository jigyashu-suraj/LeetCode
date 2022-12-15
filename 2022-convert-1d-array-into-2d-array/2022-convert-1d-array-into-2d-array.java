class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(original.length != m*n)
            return new int[0][0];
        int arr[][]=new int[m][n],row=0,col=0;
        for(int i=0;i<original.length;i++){
                arr[row][col++] = original[i];
                if(col==n){
                    row++;
                    col = 0;
                }
            }
        return arr;
        
    }
}