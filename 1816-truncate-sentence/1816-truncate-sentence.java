class Solution {
    public String truncateSentence(String s, int k) {
       String str[] = s.split(" ");
       StringBuilder sb = new StringBuilder();
        for(int i = 0; i<k-1;i++)
                sb.append(str[i]+" ");
        return sb+str[k-1];
    }
}