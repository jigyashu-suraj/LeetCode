class Solution {
    public String sortSentence(String s) {
        String word = "";
        String sum = "";
        String arr[] =s.split(" ");
        String res[] =new String[arr.length];
        for(char a:s.toCharArray()){
            if(a>=48 && a<=57){
                int ch = a - '0';
                res[ch-1] = word.trim();
                word  = "";
                
            }   
            else{
               word = word + a;
                
            }
        }
        for(String rs: res)
            sum = sum +rs+" ";
        return sum.trim();
    }
}