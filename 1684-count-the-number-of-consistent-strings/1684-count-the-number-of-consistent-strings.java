class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<Character>();
        int count = 0;
        for( char l:allowed.toCharArray())
            set.add(l);
        for(String s: words){
            boolean flag = true;
            for(int i = 0; i < s.length();i++){
                if(!set.contains(s.charAt(i))){
                    flag = false;
                    break;
                }
            }  
            if(flag)
                count++;
        
        }
        
        return count;
    }
}