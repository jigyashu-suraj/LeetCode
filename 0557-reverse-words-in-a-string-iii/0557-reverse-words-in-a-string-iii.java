class Solution {
    public String reverseWords(String s) {
        String []  r = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String w:r){
            for(int i =w.length()-1; i>=0;i--){
                sb.append(w.charAt(i));
            }
             sb.append(" ");
        }
        return sb.toString().trim();
                
    }
}