class Solution {
    public boolean detectCapitalUse(String word) {
        int count =0, n = word.length(),count2 = 0,count3 =0;
        for(int i = 0;i<n;i++){
            if(word.charAt(i)>=65 && word.charAt(i)<= 90)
                count++; 
            else if(word.charAt(i)>=97 && word.charAt(i)<= 122)
                count2++;
        }
        if(count == n)
        return true;
        else if(count2 == n)
            return true;
        else if(count == 1 && (word.charAt(0)>=65 && word.charAt(0)<= 90))
            return true;
        else 
            return false;
    }
}