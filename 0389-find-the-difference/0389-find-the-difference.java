class Solution {
    public char findTheDifference(String s, String t) {
        char s1='a', t1='a';
        int i = 0;
        for(;i<s.length();i++){
            t1 +=  t.charAt(i);
            s1 +=  s.charAt(i);
        }
        t1 +=  (int)t.charAt(i);
        return (char)(t1-s1);
        }
}