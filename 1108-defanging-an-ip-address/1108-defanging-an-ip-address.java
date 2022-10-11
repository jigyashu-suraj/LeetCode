class Solution {
    public String defangIPaddr(String address) {
        String s = "";
        char c ;
        for(int i = 0;i<address.length();i++){
            c = address.charAt(i);
            if(c == '.')
                s = s + "[.]";
            else
                s = s + c;
        }
        return s;     
    }
}