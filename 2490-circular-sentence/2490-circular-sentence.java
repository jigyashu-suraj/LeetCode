class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] word = sentence.split(" ");
        int n = word.length-1;  
        System.out.println(n);
        boolean flag = false;
        if(sentence.charAt(0)==sentence.charAt(sentence.length()-1)){
            flag = true;
        }
        if(n>0){
            for(int i = 0;i<n;i++){
                char l = word[i].charAt(word[i].length()-1);
                char k = word[i+1].charAt(0);
                System.out.println(l);
                System.out.println(k);
                if(l != k){
                    flag = false;
                     break;
            }
        }
        }
        if(flag)
            return true;
        return false;
    }
}
    