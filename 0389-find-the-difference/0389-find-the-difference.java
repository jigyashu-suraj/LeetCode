class Solution {
    public char findTheDifference(String s, String t) {
        int s1=0, t1=0;
        int i = 0;
        for(;i<s.length();i++){
            t1 +=  t.charAt(i);
            s1 +=  s.charAt(i);
        }
        t1 += t.charAt(i);
        return (char)(t1-s1);
        }
}