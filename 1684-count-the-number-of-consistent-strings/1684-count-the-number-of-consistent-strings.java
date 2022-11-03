class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<Character>();
        int count = words.length;
        for( char l:allowed.toCharArray())
            set.add(l);
        for(String s: words){
            for(int i = 0; i < s.length();i++){
                if(!set.contains(s.charAt(i))){
                    count--;
                    break;
                }
            }  
        }
        return count;
    }
}