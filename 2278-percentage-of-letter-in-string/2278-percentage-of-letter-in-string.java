class Solution {
    public int percentageLetter(String s, char letter) {
        double count = 0;
        double n = s.length();
       for(int i =0;i<n;i++)
            if(s.charAt(i) == letter)
                count++;
        if(count !=0)
            return (int)((count/n) * 100);
        return 0;
    }
}