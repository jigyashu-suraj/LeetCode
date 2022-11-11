class Solution {
    public int firstUniqChar(String s) {
        int r = 0;
        for(int i = 0;i<s.length();i++){
            if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i)))
                return i;
        }
        return -1;
    }
}