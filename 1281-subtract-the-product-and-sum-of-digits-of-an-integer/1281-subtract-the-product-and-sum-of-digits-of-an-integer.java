class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0 , mul = 1;
       while(n!=0){
          int no =n%10;
          sum  += no;
          mul *= no;
          n /=10;
       }
        return mul - sum;
    }
}