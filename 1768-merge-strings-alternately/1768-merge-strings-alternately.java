class Solution {
    public String mergeAlternately(String word1, String word2) {
       int i=0,j=0,n=word1.length(),m=word2.length();
       StringBuilder sb = new StringBuilder();
        while(i<n || j<m){
            if(i<n)
                sb.append(word1.charAt(i++));
            if(j<m)
                sb.append(word2.charAt(j++));
        }
        return sb.toString();
        
    }
}