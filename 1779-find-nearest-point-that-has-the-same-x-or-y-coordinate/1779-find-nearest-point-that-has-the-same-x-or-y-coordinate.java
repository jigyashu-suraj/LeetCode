class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int min = Integer.MAX_VALUE, index = -1;
        for(int i = 0;i<points.length;i++){
            int x2 = points[i][0], y2=points[i][1];
            if(x== x2 || y == y2){
                int distance  = Math.abs((x-x2)+(y-y2));
                if(distance<min){
                    min = distance;
                    index = i;
                }
            }
        }
        return index;
        
    }
}