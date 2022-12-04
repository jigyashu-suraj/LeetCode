class Solution {
    public boolean isCircularSentence(String sentence) {
        int n = sentence.length()-1;
        for(int  i = 0; i<n;i++){
            if(sentence.charAt(i)==' '){
                 if(sentence.charAt(i+1)!=sentence.charAt(i-1))
                     return false;
            }
        }
        return sentence.charAt(0)==sentence.charAt(n);
        
        //  String[] word = sentence.split(" ");
        // int n = word.length-1;  
        // boolean flag = false;
        // if(sentence.charAt(0)==sentence.charAt(sentence.length()-1)){
        //     flag = true;
        // }
        // if(n>0){
        //     for(int i = 0;i<n;i++){
        //         char l = word[i].charAt(word[i].length()-1);
        //         char k = word[i+1].charAt(0);
        //         if(l != k){
        //             flag = false;
        //              break;
        //     }
        // }
        // }
        // if(flag)
        //     return true;
        // return false;
    }
}
    