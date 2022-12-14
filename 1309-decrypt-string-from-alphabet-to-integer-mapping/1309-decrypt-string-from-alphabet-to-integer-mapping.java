class Solution {
    public String freqAlphabets(String s) {
        int i = s.length()-1,temp;
        String ans ="";
        while(i>=0){
            if(s.charAt(i)=='#'){
            temp = Integer.parseInt(s.substring(i-2,i));
                 i -=3; 
            }
            else{
            temp = s.charAt(i) - '0';
                i--;
            }
            ans =(char)(96+temp)+ans;
            
        }
        return ans;
    }
}