class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
         List<Integer> index = new ArrayList<>();
        if(s1.equals(s2))
            return true;
        for(int i = 0;i<s1.length();i++){
            if(s1.charAt(i) !=s2.charAt(i)){
                index.add(i);
            }
        }
        if(index.size()==2){
            int a =index.get(0), b = index.get(1);
            if(s1.charAt(a)==s2.charAt(b) && s1.charAt(b)==s2.charAt(a))
                return true;
        }
        return false;
    }
}
