class Solution {
    public int getLucky(String s, int k) {
        String l ="";
        for(int i = 0;i<s.length();i++)
           l += s.charAt(i)-'a'+1;    
        int sum=0 ;
        while(k>0){
         sum = 0;
        for(int i = 0;i<l.length();i++)
            sum +=l.charAt(i)-'0';
            l =String.valueOf(sum);
            k--;
        }
        return sum;
        
    }
}