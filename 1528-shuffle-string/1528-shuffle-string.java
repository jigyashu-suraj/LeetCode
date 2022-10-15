class Solution {
    public String restoreString(String s, int[] indices) {
    int n = s.length();
    char [] str = new char[n];
        for(int i = 0;i<n; i++){
            char ch=s.charAt(i);
            str[indices[i]]= ch;
            
        }
        return new String(str);
    }
}