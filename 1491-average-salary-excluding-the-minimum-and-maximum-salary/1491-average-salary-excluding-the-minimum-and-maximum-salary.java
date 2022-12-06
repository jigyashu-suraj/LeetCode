class Solution {
    public double average(int[] salary) {
        int n = salary.length,min =Integer.MAX_VALUE ,max =Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            if(salary[i]<min)
                min = salary[i];
            if(salary[i]>max)
                max = salary[i];  
        }
        double sum = 0 , count = 0;
        for(int  i = 0; i < n; i++){
            if(salary[i] == min || salary[i] == max)
                continue;
            sum = sum + salary[i];
            count  = count + 1;  
        }
        return sum / count;
        
    }
}