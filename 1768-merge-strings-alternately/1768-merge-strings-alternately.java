class Solution {
    public String mergeAlternately(String word1, String word2) {
        List<Character> word = new ArrayList<Character>();
        int i=0,j=0;
        
        while(i<word1.length() && j<word2.length()){
            word.add(word1.charAt(i));
            word.add(word2.charAt(j));
            i++;j++;
        }
        while(i<word1.length()){
             word.add(word1.charAt(i));
            i++;
        }
        while(j<word2.length()){
             word.add(word2.charAt(j));
            j++;
        }
        StringBuilder sb = new StringBuilder();
        for (Character ch : word) {
            sb.append(ch);
        }
 
        
        return sb.toString();
        
    }
}