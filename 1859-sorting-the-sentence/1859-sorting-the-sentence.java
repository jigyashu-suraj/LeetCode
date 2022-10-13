class Solution {
    public String sortSentence(String s) {
        String sum = "";
        String arr[] =s.split(" ");
        String res[] =new String[arr.length];
        for(String word:arr){
            char i = word.charAt(word.length()-1);
            int ch = i - '0';
            res[ch - 1 ] = word.substring(0,word.length()-1);
        }
        
        return String.join(" ",res);
    }
}